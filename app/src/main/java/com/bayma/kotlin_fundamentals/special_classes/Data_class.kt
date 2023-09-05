package com.bayma.kotlin_fundamentals.special_classes

fun main() {

    val person = Person("Pedro", "00011133344", "pedrobayma01@gmail.com")

    //About componentN() method
    //We can do this because we get the variable of componentN method
    val (name, cpf, email) = person
    println("$name has $cpf and his email is $email")
    //That`s the same as
    println("${person.component1()} has ${person.component2()} and his email is ${person.component3()}")

    //Because data class has equals/hasCode methods implemented, we can compare those objects
    val person2 = Person("Vitória", "99988877766", "vitoria@gmail.com")
    println(person.equals(person2))

}

data class Person(val name: String, val cpf: String, val email: String) {

}