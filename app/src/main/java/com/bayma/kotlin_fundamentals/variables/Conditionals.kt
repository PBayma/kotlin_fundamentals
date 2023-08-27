package com.bayma.kotlin_fundamentals.variables

fun main() {
    var result : String
    var value = 4

    result = when{
        value % 2 == 0 -> "par"
        else -> "impar"
    }

    println(result)
}