package com.bintina.realestatemanagermvvm

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import junit.framework.TestCase
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginInstrumentedTest {
    @Rule
    @JvmField
    val rule: ActivityScenarioRule<MainActivity> = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun background_views_present_correctly(){
        TestCase.assertNotNull(withId(R.layout.activity_main))
        TestCase.assertNotNull(withId(R.layout.fragment_login))
        TestCase.assertNotNull(withId(R.id.login_container))
        //assertNotNull(withId(R.id.login_overlay_view))

    }



    @Test
    fun google_button_functions_as_expected(){
        TestCase.assertNotNull(withId(R.id.google_login))
        Espresso.onView(withId(R.id.google_login)).perform(ViewActions.click())

    }
}