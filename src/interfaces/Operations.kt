package interfaces

enum class Operations(order: Int, symbol: String) {
    PLUS(2, "+"),
    MINUS(2, "-"),
    MULTIPLICATION(1, "*"),
    DIVISION(1, "/");
}