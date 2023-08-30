package com.bayma.kotlin_fundamentals.class_and_objects.exercises

fun main() {
    val firstCar = Vehicle(model = "Corsinha")
    val timesToAccelerate = 4

    for (i in 0..timesToAccelerate) {
        firstCar.accelerate()
    }

    firstCar.decelerate()

    println("A velocidade atual do ${firstCar.model} é ${firstCar.getCurrentVelocity()}")
    //Result is always 10 times timesToAccelerate or if velocity is already 0 it's gonna be 0
}

class Vehicle(val model: String) {
    private var velocity: Long = 0
    private var acceleration: Long = 10

    fun accelerate() {
        velocity += acceleration
    }

    fun decelerate() {
        when {
            velocity - acceleration < 0 -> velocity = 0
            else -> velocity -= acceleration
        }
    }

    fun getCurrentVelocity(): Long {
        return velocity
    }
}