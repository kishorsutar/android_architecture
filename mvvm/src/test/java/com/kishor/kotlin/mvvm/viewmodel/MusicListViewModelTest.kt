package com.kishor.kotlin.mvvm.viewmodel

import android.util.Log
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Assert.assertNotNull
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

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
}
