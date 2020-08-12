package com.kishor.kotlin.mvvm.viewmodel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    lateinit var sut: MainViewModel

    @Before
    fun init() {
        sut = MainViewModel()
    }

    @Test
    fun verifyMainViewModelIsPresent() {
        assertNotNull(sut)
    }

    @Test
    fun verifyMainViewModelHasDisplayString() {
        assertEquals("MVVM", sut.displayString)
    }
}