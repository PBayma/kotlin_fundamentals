package com.bayma.kotlin_fundamentals.exercise

fun main() {
    val numberList = mutableListOf<Int>()
    val textList = listOf<String>("Pedro", "Vitória", "João", "Jose")

    for (i in 1..99){
        numberList.add(i)
    }

    val evenValues = numberList.filter { value -> value % 2 == 0 }
    println("Even values between 1 - 99:")
    println(evenValues)

    val concatenatedText = textList.map { value -> "Olá $value" }
    concatenatedText.forEach { println(it) }


}