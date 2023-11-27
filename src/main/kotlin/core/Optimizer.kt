package core

import CorundumLexer
import CorundumParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

class Optimizer (function: String) {

    private val charStream  = CharStreams.fromString(function)
    private val tokenSource = CorundumLexer(charStream)
    private val tokenStream = CommonTokenStream(tokenSource)
    private val parser      = CorundumParser(tokenStream)
    private val tree        = parser.function_definition()
    private val visitor     = RubyTailOptimizer()
//
    fun optimize(): String =
        "${visitor.visit(tree)}\n"

}