package com.bayma.kotlin_fundamentals.special_classes.exercises

fun main() {
    val firstInstance = FirstInstance()
    firstInstance.printIfIsWeekend()

    val secondInstance = SecondInstance()
    secondInstance.printIfIsWeekend()
}

class FirstInstance {
    init {
        UtilityHelper.setCurrentDay(DaysOfWeek.MONDAY)
    }

    fun printIfIsWeekend() {
        println(UtilityHelper.isWeekend())
    }
}

class SecondInstance {
    init {
        UtilityHelper.setCurrentDay(DaysOfWeek.SUNDAY)
    }

    fun printIfIsWeekend() {
        println(UtilityHelper.isWeekend())
    }
}