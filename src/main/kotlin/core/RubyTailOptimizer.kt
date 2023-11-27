package core

import CorundumBaseVisitor
class RubyTailOptimizer : CorundumBaseVisitor<String?>() {


    val symbols = ArrayList<String>()

    private fun isTailCall(ctx: CorundumParser.Return_statementContext?): Boolean {
        // The last expression in a function is a function call
        val funCall = ctx?.all_result()
            ?.dynamic_result()
            ?.dynamic_()
            ?.function_call_assignment()
            ?.let { true } ?: false

        // There is no other expression before or after the function call
        val lastExpr = ctx?.all_result()
            ?.dynamic_result()
            ?.children?.size
            ?.let { it == 1 } ?: false

        return funCall && lastExpr
    }

    private fun getTailCallParams(ctx: CorundumParser.Return_statementContext?): String? {
        return ctx?.all_result()
            ?.dynamic_result()
            ?.dynamic_()
            ?.function_call_assignment()
            ?.function_call()
            ?.params
            ?.function_call_params()
            ?.function_param()
            ?.joinToString(" ") { it.text }
    }

    private fun returnTailCall(ctx: CorundumParser.Return_statementContext?, symbols: ArrayList<String>): String? {
        return if (isTailCall(ctx)) {
            val tailCallParams = getTailCallParams(ctx)
                ?.split(" ") ?: emptyList()

            val initializers =
                symbols.toList().zip(tailCallParams)
                    .joinToString("\n") { (name, value) -> "_$name = $value" }

            "$initializers"
        } else {
            "return ${ctx?.all_result()?.text}"
        }
    }
    override fun visitProgram(ctx: CorundumParser.ProgramContext?): String? {
        return super.visitProgram(ctx)
    }

    override fun visitFunction_definition(ctx: CorundumParser.Function_definitionContext?): String? {

        val returnCtx = ctx?.function_definition_body()
            ?.expression_list()
            ?.expression()
            ?.return_statement()

        val clojureDefCtx = ctx?.function_definition_body()
            ?.expression_list()
            ?.expression_list()
            ?.expression()
            ?.clojure_definition()

        val paramNames: String = clojureDefCtx
            ?.clojure_definition_header()?.let { visit(it) } ?: ""

        val paramInits = getTailCallParams(returnCtx) ?: ""


        val initializers =
            paramNames.split(" ").zip(paramInits.split(" "))
                .joinToString("\n") { (name, value) -> "_$name = $value" }

        val functionHeader = visit(ctx?.function_definition_header()) ?: ""

        val functionBodyClojure = visit(clojureDefCtx) ?: ""


        return """
            $functionHeader$initializers
            $functionBodyClojure
            end
        """.trimIndent()
    }


    override fun visitClojure_definition(ctx: CorundumParser.Clojure_definitionContext?): String? {
        val params = visit(ctx?.clojure_definition_header())
            ?.split(" ")
            ?.joinToString("\n") { "$it = _$it" } ?: ""

        val body = ctx?.function_definition_body()?.let { visit(it.expression_list()?.expression()) }

        return """
            while true
                $params
                $body
            end
        """.trimIndent()
    }

    override fun visitClojure_definition_header(ctx: CorundumParser.Clojure_definition_headerContext?): String {

        val params = visit(ctx?.function_definition_params()) ?: "No args"

        params.split(" ").forEach { symbols.add(it) }

        return params
    }

    override fun visitFunction_definition_params(ctx: CorundumParser.Function_definition_paramsContext?): String? {
        val params = ctx?.function_definition_params_list()
            ?.function_definition_param_id()
            ?.joinToString(" ") { it.text } ?: "No args"

        return params
    }

    override fun visitFunction_call_params(ctx: CorundumParser.Function_call_paramsContext?): String? {
        val params = ctx?.function_param()
            ?.joinToString(" ") { it.text } ?: "No args"

        return params

    }

    override fun visitReturn_statement(ctx: CorundumParser.Return_statementContext?): String {

        return if (isTailCall(ctx)) {

            val returnExpr = returnTailCall(ctx, symbols)

            """
                $returnExpr
                next
            """.trimIndent()
        }
        else {
            "return ${ctx?.all_result()?.text}"
        }
    }

    override fun visitFunction_definition_header(ctx: CorundumParser.Function_definition_headerContext?): String =
        ctx?.children?.joinToString(" ") { it.text } ?: ""


    override fun visitIf_statement(ctx: CorundumParser.If_statementContext?): String? {
        val condition = ctx?.cond_expression()?.text ?: ""
        val bodyCtx = ctx?.statement_body(0)
            ?.statement_expression_list()
            ?.expression()
            ?.return_statement()
        val body = bodyCtx?.let { visit(it) } ?: ""
        val maybeElsif = ctx?.elsif_statement()?.let { visit(it.if_elsif_statement()) } ?: "end"
        val maybeElse = ctx?.else_token()?.let {
            ctx?.statement_body(1)
                ?.statement_expression_list()
                ?.expression()
                ?.return_statement()?.let { "${visit(it)}" }
        } ?: ""

        return """
            if $condition
                $body
            $maybeElsif
            $maybeElse
            
        """.trimIndent()
    }

    override fun visitIf_elsif_statement(ctx: CorundumParser.If_elsif_statementContext?): String? {
        val condition = ctx?.cond_expression()?.text ?: ""
        val bodyCtx = ctx?.statement_body(0)
            ?.statement_expression_list()
            ?.expression()
            ?.return_statement()
        val body = bodyCtx?.let { visit(it) } ?: ""
        val maybeElsif = ctx?.if_elsif_statement()?.let { visit(it) } ?: "end"
        val maybeElse = ctx?.else_token()?.let {
            ctx?.statement_body(1)
                ?.statement_expression_list()
                ?.expression()
                ?.return_statement()?.let { "${visit(it)}" }
        } ?: ""

        return """
            elsif $condition
                $body
            $maybeElsif
            $maybeElse
            
        """.trimIndent()

    }


}