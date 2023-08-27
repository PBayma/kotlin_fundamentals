package com.bayma.kotlin_fundamentals.functions

fun main() {
    val sum = firstFunction(10, 3)

    println(sum)

    println("Using compact function: ${compactFunction(10, 3)}")

    println("Using named parameters: ${compactFunction(secondValue =  3, firstValue = 10)}")
}

fun firstFunction(firstValue: Int, secondValue: Int): Int {
    return firstValue + secondValue
}

fun compactFunction(firstValue: Int, secondValue: Int) = firstValue + secondValue