package com.bayma.kotlin_fundamentals.special_classes

fun main() {
    val example = OtherClass()

    println(example.printCurrentSeason())

    ScheduleHandler.setSeason(Season.WINTER)

    println(example.printCurrentSeason())

}

object ScheduleHandler {
    private var season: Season = Season.SUMMER

    fun setSeason(newSeason: Season) {
        this.season = newSeason
    }

    fun getSeason(): Season {
        return this.season
    }
}

class OtherClass {
    init {
        ScheduleHandler.setSeason(Season.SPRING)
    }

    fun printCurrentSeason() = ScheduleHandler.getSeason()
}