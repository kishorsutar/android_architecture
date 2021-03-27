package com.kishor.solid.kotlin

/**
 * Depends on abstraction and not on implementation
 *
 * High level module should not depend on low level modules both should depend on abstraction
 *
 * Abstraction should not depend on details. Details should depend on abstraction
 */

//
//class BeerBot {
//    fun dispenseBeer() {
//        println("Dispense beer")
//    }
//}
//
//class WineBot {
//    fun dispnseWine () {
//        println("Dispense wine")
//    }
//}
//
//class RoboPub {
//    private val beerBot = BeerBot()
//    private val wineBot = WineBot()
//
//    fun dispenseDrink() {
//        beerBot.dispenseBeer()
//        wineBot.dispnseWine()
//    }
//}

/**
 * What if we change and add one more drink bot
 *
 * let's refactor
 */

interface DispenserRobot {
    fun dispense()
}

class BeerBot : DispenserRobot {
    override fun dispense() {
        println("Dispense Beer")
    }
}

class WineBot : DispenserRobot {
    override fun dispense() {
        println("Dispense Wine")
    }
}

class RoboPub(private val drinkDispenserRobots: List<DispenserRobot>) {

    fun dispenseDrinks() {
        drinkDispenserRobots.forEach {
            it.dispense()
        }
    }
}
