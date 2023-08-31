package com.bayma.kotlin_fundamentals.polimorfism.exercise

fun main() {
    val motorcycle = Motorcycle()
    val car = Car()

    println(motorcycle)

    car.accelerate()
    car.accelerate()
    println(car)
    car.decelerate()
    println(car)
}

interface Vehicle {
    var velocity: Long
    val acceleration: Long

    fun accelerate() {
        velocity += acceleration
    }

    fun decelerate() {
        when {
            velocity - acceleration < 0 -> velocity = 0
            else -> velocity -= acceleration
        }
    }

}

class Car() : Vehicle {
    override var velocity: Long = 0
    override val acceleration: Long = 5

    override fun toString(): String {
        return "The car has acceleration: $acceleration, and the current velocity is $velocity"
    }

}

class Motorcycle() : Vehicle {
    override var velocity: Long = 0
    override val acceleration: Long = 5

    override fun toString(): String {
        return "The motorcycle has acceleration: $acceleration, and the current velocity is $velocity"
    }

}