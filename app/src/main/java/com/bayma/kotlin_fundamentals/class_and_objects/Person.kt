package com.bayma.kotlin_fundamentals.class_and_objects

fun main() {
    val pedro = Person(firstName = "Pedro", lastName = "Bayma", height = 1.83, weight = 92.0)

    println(pedro.getImc())
}

class Person(firstName: String, lastName: String, height: Double, weight: Double) {
    val firstName: String = firstName
    val lastName: String = lastName
    val height: Double = height
    val weight: Double = weight
    private val imc: Double

    init {
        imc = weight / (height * height)
    }

    fun getImc(): Double {
        return imc
    }
}
/* Or can be like that
* class Person(val firstName: String, val lastName: String) {}
* */