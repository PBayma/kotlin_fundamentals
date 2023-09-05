package com.bayma.kotlin_fundamentals.special_classes.exercises

enum class DaysOfWeek(val inPortuguese: String){
    SUNDAY("Domingo"),
    MONDAY("Segunda"),
    TUESDAY("Terça"),
    WEDNESDAY("Quarta"),
    THURSDAY("Quinta"),
    FRIDAY("Sexta"),
    SATURDAY("Sabado"),
}
fun main() {

    val monday = DaysOfWeek.MONDAY

    println(monday.inPortuguese)
}

