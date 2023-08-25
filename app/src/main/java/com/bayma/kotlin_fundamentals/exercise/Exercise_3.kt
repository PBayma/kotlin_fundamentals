package com.bayma.kotlin_fundamentals.exercise

fun main() {
    var newArray : IntArray = IntArray(40) {0}
    var mutableList : MutableList<Int> = mutableListOf()
    var sum : Int = 0

    for (i in newArray.indices){
        newArray[i] = i
    }
    for (i in 0 .. 98){
        mutableList.add(i, i + 1)
    }


    for (i in mutableList.indices){
        sum += mutableList[i]
    }

    println(sum)
}