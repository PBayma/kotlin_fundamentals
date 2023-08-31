package com.bayma.kotlin_fundamentals.polimorfism

fun main() {
    val jogador = Player(name = "Pedro", lastName = "Bayma", age = 16, shirtNumber = 24)
    val pessoa = Person("Vitória", "Lima", 27)

    val teste: Person = jogador

    println(jogador)
    println(teste)
}

open class Person(val name: String, val lastName: String, val age: Int) {

    override fun toString(): String {
        return "${name} ${lastName}, joga pelo time da escola e tem de idade ${age}"
    }
}

class Player(name: String, lastName: String, age: Int, val shirtNumber: Int) :
    Person(name, lastName, age) {

    override fun toString(): String {
        return super.toString() + " anos!"
    }

}