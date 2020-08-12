package com.kishor.kotlin.mvvm.viewmodel

import androidx.lifecycle.ViewModel
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class MainViewModelTest {

    lateinit var sut : MainViewModel

    @Before
    fun init() {
        sut = MainViewModel()
    }

    @Test
    fun verifyMainViewModelIsPresent() {
        assertNotNull(sut)
    }

    @Test
    fun verifyMainViewModelIsViewModel() {
        assertTrue(sut is ViewModel)
    }
}