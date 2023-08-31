package com.bayma.kotlin_fundamentals.polimorfism

fun main() {
    val animalFactory = AnimalFactory()
    val animals = mutableListOf<Animal>()

    for (i in 1..100) {
        animals.add(animalFactory.createAnimal(i % 2, i))
    }

    println(animals)
}

class AnimalFactory {
    fun createAnimal(type: Int, minEnergy: Int): Animal {
        return when (type) {
            1 -> Lion(minEnergy)
            else -> Ant(minEnergy)
        }
    }
}