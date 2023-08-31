package com.bayma.kotlin_fundamentals.polimorfism.exercise

fun main() {
    val motorcycle = Motorcycle()
    val car = Car()

    println(motorcycle)

    car.accelerate()
    car.accelerate()
    println(car)
}

abstract class Vehicle {
    private var velocity: Long = 0
    abstract val acceleration: Long

    fun accelerate() {
        velocity += acceleration
    }

    override fun toString(): String {
        return when (this) {
            is Car -> "The car has acceleration: $acceleration, and the current velocity is $velocity"
            else -> "The motorcycle has acceleration: $acceleration, and the current velocity is $velocity"
        }

    }
}

class Car() : Vehicle() {
    override val acceleration: Long = 5

}

class Motorcycle() : Vehicle() {
    override val acceleration: Long = 5

}