package com.bayma.kotlin_fundamentals.functions

fun main() {
    val lambdaStringConcatenateFunction: (String, String) -> String = {firstText: String, secondText: String -> "$firstText $secondText"}

    val result = lambdaStringConcatenateFunction("Olá", "mundo")

    println(result)

    println("Result with lambda: ${highOrderFunctionWithLambda("Olá", "mundo", lambdaStringConcatenateFunction)}")
}

fun highOrderFunctionWithLambda(firstText: String, secondText: String, operation: (String, String)-> String) : String{
    return operation(firstText, secondText)
}