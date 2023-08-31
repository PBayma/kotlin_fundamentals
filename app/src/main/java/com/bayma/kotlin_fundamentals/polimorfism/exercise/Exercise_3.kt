package com.bayma.kotlin_fundamentals.polimorfism.exercise

fun main() {
    val factory = VehicleFactory()
    val vehicleList = mutableListOf<Vehicle>()

    for (i in 1..10) {
        vehicleList.add(factory.createVehicle(i % 2))
    }

    vehicleList.forEach { vehicle -> vehicle.accelerate() }

    println(vehicleList)
}

abstract class Vehicle {
    private var velocity: Long = 0
    abstract val acceleration: Long

    fun accelerate() {
        velocity += acceleration
    }

    override fun toString(): String {
        return when (this) {
            is Car -> "The car has acceleration: $acceleration, and the current velocity is $velocity\n"
            else -> "The motorcycle has acceleration: $acceleration, and the current velocity is $velocity\n"
        }

    }
}

class VehicleFactory {
    fun createVehicle(type: Int): Vehicle {
        return when (type) {
            1 -> Car()
            else -> Motorcycle()
        }

    }
}

class Car() : Vehicle() {
    override val acceleration: Long = 5
}

class Motorcycle() : Vehicle() {
    override val acceleration: Long = 5
}