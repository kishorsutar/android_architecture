package com.kishor.architecture.mvp.ui

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.kishor.architecture.mvp.R
import com.kishor.architecture.mvp.ui.songs.MainActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class MainActivityTest {

    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity> =
        ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun songIconIsVisible() {
        onView(withId(R.id.song_image)).check(matches(isDisplayed()))
    }

    @Test
    fun songNameIsVisible() {
        onView(withId(R.id.song_detail)).check(matches(isDisplayed()))
    }

}