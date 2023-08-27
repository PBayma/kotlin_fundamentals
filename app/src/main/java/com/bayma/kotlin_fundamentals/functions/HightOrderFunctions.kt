package com.bayma.kotlin_fundamentals.functions

fun main() {
    // Necessário os :: para passar a assninatura da função e não ela sendo executada
    highOrderFunction("Olá", "Mundo", ::stringConcatenateFunction )
}


fun highOrderFunction(firstText: String, secondText: String, operation: (String, String)-> String){
    println(operation(firstText, secondText))
}

fun stringConcatenateFunction(firstText: String, secondText: String) = firstText + secondText