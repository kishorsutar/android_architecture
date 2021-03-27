package com.kishor.solid.kotlin

/**
 * If we follow Open closed principle for too many features at once in interface
 * that leads unnecessary override functions in sub types
 *
 * Liskov substitution says sub class/type can be replaced by their parent classes
 */

/*abstract class Avengers {
    abstract fun fly(lat: Double, long: Double)
    abstract fun smash()
    abstract fun mission()
}

class HawkEye: Avengers()  {
    override fun fly(lat: Double, long: Double) {
        println("I can't fly")
    }

    override fun smash() {
        println("I can't fly")
    }

    override fun mission() {
        println("I can do mission")
    }
}

class IronMan: Avengers() {
    override fun fly(lat: Double, long: Double) {
        println("I can fly")
    }

    override fun smash() {
        println("I can smash")
    }

     override fun mission() {
        println("I can do mission")
    }
}*/

/**
 * this defeats the purpose of liskove sub principle
 *
 * Liskov substitution says sub class/type can be replaced by their parent classes
 */

abstract class Avengers {
    abstract fun mission()
}

abstract class TeamIronMan : Avengers() {
    abstract fun fly()

    override fun mission() {
        println("I can do mission")
    }
}



