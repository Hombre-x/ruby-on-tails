package app

import core.Optimizer
import java.io.File

val input = """
    def factorial(n)
        def rec tailfactorial(n, acc)
            if n < 0
                return 0 - 1
            elsif n == 0
                return acc
            else
                return tailfactorial(n - 1, acc * n)
            end
        end
        
        return tailfactorial(n, 1)
    
    end
      
""".trimIndent()


val path = "./src/main/resources/program.rb"

val function = File(path).readLines().joinToString("\n")

fun main() {
    val optimizer = Optimizer(function)
    println(optimizer.optimize())
}