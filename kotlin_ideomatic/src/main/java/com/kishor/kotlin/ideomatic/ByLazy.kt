package com.kishor.kotlin.ideomatic

import java.lang.Thread.sleep
import kotlin.random.Random

fun main() {
// Memory will be created and stored the evaluation in a memory for heavy running tasks
    val name: String by lazy {
        println("Computed")
        sleep(3000) // heavy running tasks happens only once
        "Avengers"
    }

    println(name)
    println(name)
    println(name)


    // lazy block

    val result = lazy { evaluateLazyBlock() }

    println(result.value)
    println(result.value)
    println(result.value)

}

fun evaluateLazyBlock(): Int {
    println("computed")
    sleep(1000)
    return Random(System.currentTimeMillis()).nextInt()
}
