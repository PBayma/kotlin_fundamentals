package com.bayma.kotlin_fundamentals.exercise

fun main() {
    val oddVariable = 3
    val evenVariable = 4

    if (evenVariable % 2 == 0){
        println("É par")
    }else{
        println("É impar")
    }

    if (oddVariable % 2 == 0){
        println("É par")
    }else{
        println("É impar")
    }

    when{
        evenVariable % 2 == 0 -> println("É par")
        else -> println("É impar")
    }

    when{
        oddVariable % 2 == 0 -> println("É par")
        else -> println("É impar")
    }
}