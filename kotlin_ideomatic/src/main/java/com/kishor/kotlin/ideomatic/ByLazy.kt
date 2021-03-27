package com.kishor.kotlin.ideomatic

import java.lang.Thread.sleep

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
}
