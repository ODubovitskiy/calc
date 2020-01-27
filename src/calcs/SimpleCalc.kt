package calcs

import interfaces.AbstractCalculator

class SimpleCalc(_first: Float, _second: Float) : AbstractCalculator() {

    override val firstArgument: Float = _first
    override val secondArgument: Float = _second

}