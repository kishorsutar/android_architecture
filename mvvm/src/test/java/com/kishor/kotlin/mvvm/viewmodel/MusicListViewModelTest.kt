package com.kishor.kotlin.mvvm.viewmodel

import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test

class MusicListViewModelTest {

    lateinit var sut: MusicListViewModel

    @Before
    fun init() {
        sut = MusicListViewModel()
    }

    @Test
    fun verifyMainViewModelIsPresent() {
        assertNotNull(sut)
    }

    @Test
    fun verifyMainViewModelHasDisplayString() {
        assertEquals("MVVM", sut.displayString)
    }

    @Test
    fun verifyMainViewModelDisplaysCounter() {
        assertEquals("0", sut.displayCounter())
    }
}
