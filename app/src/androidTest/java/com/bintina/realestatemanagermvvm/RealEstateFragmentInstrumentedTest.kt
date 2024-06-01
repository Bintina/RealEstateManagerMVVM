package com.bintina.realestatemanagermvvm

import androidx.fragment.app.testing.FragmentScenario
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.bintina.realestatemanagermvvm.realestate.view.PropertyFragment
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class RealEstateFragmentInstrumentedTest {
    private lateinit var scenario: FragmentScenario<PropertyFragment>

    @Before
    fun setup(){
        scenario = FragmentScenario.launchInContainer(PropertyFragment::class.java)

    }

  /*  @Test
    fun realestate_list_views_exist(){
        Assert.assertNotNull(ViewMatchers.withId(R.id.properties_list_recycler_container))
        Assert.assertNotNull(ViewMatchers.withId(R.id.realestate_card_view))
    }*/
}