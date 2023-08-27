package com.bayma.kotlin_fundamentals.functions

fun main() {

    var list : MutableList<Int> = mutableListOf<Int>()

    val textList = listOf<String>("Pedro", "Vitória", "João")


    for (i in 1..98){
        list.add(i)
    }

    println("There are ${getEvenValues(list).size} even numbers inside the list ")
    println(getEvenValues(list))

    println("Now it is a list getting even values using map:")
    println(getEvenValuesWithMap(list))

    var newMap = textList.associateBy {
        it.length
    }

    println(newMap)

}

fun getEvenValues(completeList : MutableList<Int>) : List<Int> {
    return completeList.filter { value -> value % 2 == 0 }
}

fun getEvenValuesWithMap(completeList: MutableList<Int>): List<Int> {
    val newList = completeList.map { value: Int -> if (value % 2 == 0) value else 0 }
    return newList.filter { value -> value != 0 }
}


