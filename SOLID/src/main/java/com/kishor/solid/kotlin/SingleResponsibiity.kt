package com.kishor.solid.kotlin

/*class Robot(private val greet: String, private val type: String) {
    fun greet(): String {
        return "I'm $greet of type $type"
    }
}*/
// this class was doing two things, so moved to separate class

data class Robot(val name: String, val type: String)


class Responsibility(private val robot: Robot) {

    fun greet(): String {
        return "I'm ${robot.name} of type ${robot.type}"
    }
}
