package com.bayma.kotlin_fundamentals.polimorfism

fun main() {
    val jogador = PalmeirasGoalKeeper("Pedro", 26, 14, 8)

    println(jogador.rating())
}

// Interface variables are immutable. Instead abstract class can be mutable
abstract class GoalKeeper {
    abstract var name: String
    abstract var age: Int

    abstract fun rating(): Int
}

class PalmeirasGoalKeeper(
    override var name: String,
    override var age: Int,
    val numberOfGoalsSaved: Int,
    val numberOfGames: Int
) : GoalKeeper() {
    override fun rating(): Int {
        return numberOfGoalsSaved / numberOfGames
    }

}