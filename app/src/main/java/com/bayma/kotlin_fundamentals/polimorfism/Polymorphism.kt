package com.bayma.kotlin_fundamentals.polimorfism

fun main() {
    val ant = Ant(2)
    val lion = Lion(6)


    val animalList = listOf<Animal>(ant, lion)

    animalList.forEach { animal ->
        println(animal)
        animal.feed()
        println(animal)

        if (animal is Lion) {
            println(animal.roar())
        }
    }
}

abstract class Animal {
    var energy = 0
    abstract var minEnergy: Int

    abstract fun feed()
    abstract fun play()

    fun isHungry(): Boolean {
        return energy < minEnergy
    }

    override fun toString(): String {
        return "Energy: $energy, isHungry: ${isHungry()}"
    }
}

class Ant(override var minEnergy: Int) : Animal() {
    override fun feed() {
        super.energy += 1
    }

    override fun play() {
        super.energy -= 1
    }
}

class Lion(override var minEnergy: Int) : Animal() {

    override fun feed() {
        super.energy += 2
    }

    override fun play() {
        super.energy -= 1
    }

    fun roar(): String {
        return "Roooarrr!"
    }

}