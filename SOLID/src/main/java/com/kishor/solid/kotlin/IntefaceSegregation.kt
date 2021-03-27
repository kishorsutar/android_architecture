package com.kishor.solid.kotlin


//interface Avenger {
//    fun fly()
//    fun smash()
//}
//
//class Hulk : Avenger {
//    override fun fly() {
//        TODO("Not yet implemented")
//    }
//
//    override fun smash() {
//        TODO("Not yet implemented")
//    }
//}

/**
 * What if we break the features with different types of interfaces
 * Segregate the interfaces
 */

interface FlyingAvenger {
    fun fly()
}

interface SmashingAvenger {
    fun smash()
}

class Hulk : SmashingAvenger {
    override fun smash() {
        println("Hulk smash")
    }
}

class IronMan : FlyingAvenger {
    override fun fly() {
        println("I can fly")
    }
}