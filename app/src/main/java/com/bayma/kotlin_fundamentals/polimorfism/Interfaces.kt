package com.bayma.kotlin_fundamentals.polimorfism

fun main() {
    val jogador = PatriotsRunnerBack("Pedro", 26, 14, 8, 5)

    println(jogador.rating())
}

// Interface variables are immutable. Instead abstract class can be mutable
interface RunnerBack {
    val name: String
    val age: Int

    fun rating(): Int
}

interface QuarterBack {
    var name: String
    var age: Int
    var ballsThrow: Int
}

class PatriotsRunnerBack(
    override var name: String, override var age: Int, val numberOfBallsTaked: Int,
    val numberOfTouchDowns: Int, override var ballsThrow: Int
) : RunnerBack, QuarterBack {
    override fun rating(): Int {
        return numberOfBallsTaked / numberOfTouchDowns
    }

}

