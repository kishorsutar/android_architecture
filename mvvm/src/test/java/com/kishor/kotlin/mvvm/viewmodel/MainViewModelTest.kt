package com.kishor.kotlin.mvvm.viewmodel

import junit.framework.Assert.assertNotNull
import org.junit.Test

class MainViewModelTest {

    @Test
    fun verifyMainViewModelIsPresent() {
        val sut = MainViewModel()
        assertNotNull(sut)
    }
}