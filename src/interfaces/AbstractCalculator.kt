package interfaces

abstract class AbstractCalculator : ICalculator {

    abstract val firstArgument: Float
    abstract val secondArgument: Float

    override fun sum(): Float = firstArgument + secondArgument

    override fun subtraction(): Float = firstArgument - secondArgument

    override fun multiplication(): Float = firstArgument * secondArgument

    override fun division(): Float {
        //TODO Division by zero
        return firstArgument / secondArgument
    }
}