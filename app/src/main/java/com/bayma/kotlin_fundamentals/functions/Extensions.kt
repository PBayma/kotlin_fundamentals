package com.bayma.kotlin_fundamentals.functions

fun main() {
    val result = 3.2.sum(14.0)

    println(result)

    val resultUsingInfix = 16.0 subtract 6.0

    println(resultUsingInfix)

}

fun Double.sum(value : Double) : Double{
    return this + value
}

infix fun Double.subtract(value: Double) : Double {
    return this - value
}