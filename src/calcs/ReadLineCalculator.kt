package calcs

import interfaces.IReadLineCalculator
import java.lang.Exception


class ReadLineCalculator() : IReadLineCalculator {

    override var expressionLine = ""

    init {
        expressionLine = getExpression()
        parseString(expressionLine)
    }

    private fun getExpression(): String {
        print("Type the line: ")
        return try {
            expressionLine = readLine()!!
            if (expressionLine != "") expressionLine else getExpression()
        } catch (e: Exception) {
            println(e.message)
            println(e.cause)
            getExpression()
        }
    }

    override fun calculate(): String {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private fun parseString(expression: String) {

        var pattern = Regex("([\\d*])+")

        println(pattern.matches(expression))

    }


}