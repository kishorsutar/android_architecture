package com.kishor.kotlin.ideomatic

// val lambdaName: (InputType) -> ReturnType = { arguments: InputType -> body }

fun main() {
    val greeter: (String, String) -> String = { name, lastName ->
        val combinedName = "$name $lastName"
        "Hello $combinedName Algorithms are cool"
    }
    val greeterOne = { name: String, lastName: String ->
        val combinedName = "$name $lastName"
        "Hello $combinedName Algorithms are cool"
    }

    val greeting = greeter("Kishor", "Sutar")

    println(greeting)


    lambdaAsAFunction {
        println("Lambda as a function")
    }

    passingArguments(3) { time ->
        println("Please repeat $time")
        "Passed from argument"
    }
}


fun lambdaAsAFunction(block: () -> Unit) {
    println("function call")
    block()
}

fun passingArguments(times: Int, block: (Int) -> String) {
    repeat(times) { println("----------") }
    val fromBlockGotString = block(3)
    println(fromBlockGotString)
}