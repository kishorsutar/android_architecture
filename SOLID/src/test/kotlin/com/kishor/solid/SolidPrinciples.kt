package com.kishor.solid

import com.kishor.solid.kotlin.Responsibility
import com.kishor.solid.kotlin.Robot
import junit.framework.Assert.assertEquals
import org.junit.Test

class SolidPrinciples {

    @Test
    fun verifyRobotGreetsProperly() {
        val givenRobot = Robot("Iron Man", "Jarvis")
        val sut = Responsibility(givenRobot)

        assertEquals("I'm Iron Man of type Jarvis", sut.greet())
    }

}