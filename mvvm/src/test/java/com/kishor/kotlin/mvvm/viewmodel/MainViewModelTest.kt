package com.kishor.kotlin.mvvm.viewmodel

import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainViewModelTest {

    lateinit var sut: MainViewModel

    @Before
    fun init() {
        sut = MainViewModel(ApplicationProvider.getApplicationContext())
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
