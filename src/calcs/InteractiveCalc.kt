package calcs

import interfaces.AbstractCalculator
import interfaces.ICalculator
import java.lang.IndexOutOfBoundsException
import kotlin.system.exitProcess

class InteractiveCalc : AbstractCalculator() {

    override var firstArgument: Float = 0.0f
    override var secondArgument: Float = 0.0f

    init {
        val args = getArguments()
        firstArgument = args["first"]!!
        secondArgument = args["second"]!!
    }

    private fun getArguments(): Map<String, Float> {
        return try {
            val (a, b) = readLine()!!.split(" ")
            val first: Float = a.toFloat()
            val second: Float = b.toFloat()
            mapOf<String, Float>("first" to first, "second" to second)
        } catch (e: java.lang.NumberFormatException) {
            println("Input is not correct. Please enter the numbers")
            getArguments()
        } catch (e: IndexOutOfBoundsException) {
            println("Please input two arguments")
            getArguments()
        }
    }
}