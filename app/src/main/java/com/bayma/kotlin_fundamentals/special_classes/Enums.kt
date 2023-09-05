package com.bayma.kotlin_fundamentals.special_classes

fun main() {
    val season = Season.SPRING

    season.color()

    //Parse enum values
    println(season.name)

    println(Season.valueOf("WINTER"))
}

enum class Season{
    WINTER {
        override fun color(): String {
            return "white"
        }
    },
    FALL {
        override fun color(): String {
            return "orange"
        }
    },
    SUMMER {
        override fun color(): String {
            return "red"
        }
    },
    SPRING {
        override fun color(): String {
            return "yellow"
        }
    };

    abstract fun color() : String
}