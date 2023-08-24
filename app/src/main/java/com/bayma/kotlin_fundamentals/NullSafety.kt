package com.bayma.kotlin_fundamentals

fun main() {
    val nullable : Int? = null

    //Verifying if variable is null
    val result = nullable ?: 5

    println(result)
}