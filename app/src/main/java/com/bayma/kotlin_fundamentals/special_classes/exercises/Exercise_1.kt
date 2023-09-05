package com.bayma.kotlin_fundamentals.special_classes.exercises

fun main() {
    val text = "Pedro"

    println(text.splitText())
}

fun String.splitText(): List<Char> {
    val list = mutableListOf<Char>()

    for (i in this) {
        list.add(i)
    }
    return list
}