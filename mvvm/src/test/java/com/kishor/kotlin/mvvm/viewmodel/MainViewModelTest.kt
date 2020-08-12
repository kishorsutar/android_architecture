package com.kishor.kotlin.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import org.junit.Assert.*
import org.junit.Test

class MainViewModelTest {

    @Test
    fun verifyMainViewModelIsPresent() {
        val sut = MainViewModel()
        assertNotNull(sut)
    }

    @Test
    fun verifyMainViewModelIsViewModel() {
        val sut = MainViewModel()
        assertTrue(sut is ViewModel)
    }
}