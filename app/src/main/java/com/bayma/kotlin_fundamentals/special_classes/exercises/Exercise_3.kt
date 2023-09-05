package com.bayma.kotlin_fundamentals.special_classes.exercises

fun main() {
    println(UtilityHelper.isWeekend())
}

object UtilityHelper {
    private var currentDay = DaysOfWeek.SUNDAY

    fun setCurrentDay(updatedDay: DaysOfWeek) {
        currentDay = updatedDay
    }

    fun isWeekend(): Boolean {
        return when (currentDay) {
            DaysOfWeek.SUNDAY, DaysOfWeek.SATURDAY -> true
            else -> false
        }
    }
}