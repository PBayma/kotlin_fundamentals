package com.bayma.kotlin_fundamentals.exercise

fun main() {
    val firstValue = 1
    val secondValue = 15

    val sum = sumFunction(firstValue, secondValue)
    val multiplication = multiplicationFunction(firstValue, secondValue)
    val calculatorSumResult = calculator(firstValue, secondValue, ::sumFunction)
    val calculatorMultiplicationResult = calculator(firstValue, secondValue, ::multiplicationFunction)

    println("Result of sum: $sum")
    println("Result of multiplication: $multiplication")
    println("Result of sum on calculator: $calculatorSumResult")
    println("Result of multiplication on calculator: $calculatorMultiplicationResult")

}

fun sumFunction(firstValue: Int, secondValue: Int): Int {
    return firstValue.sum(secondValue)
}

fun multiplicationFunction(firstValue: Int, secondValue: Int) = firstValue.multiply(secondValue)

fun calculator(firstValue: Int, secondValue: Int, operation: (Int, Int) -> Int): Int {
    return operation(firstValue, secondValue)
}
fun Int.sum(value: Int): Int{
    return this + value
}

fun Int.multiply(value: Int): Int{
    return this * value
}