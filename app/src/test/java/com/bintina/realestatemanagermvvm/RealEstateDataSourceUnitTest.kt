package com.bintina.realestatemanagermvvm

import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LifecycleRegistry
import androidx.lifecycle.coroutineScope
import com.bintina.realestatemanagermvvm.realestate.model.ListingItem
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertTrue
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.RuleChain
import org.junit.rules.TestRule

@ExperimentalCoroutinesApi
class RealEstateDataSourceUnitTest {
/*    private val testDispatcher = StandardTestDispatcher()
    private lateinit var lifecycleOwner: LifecycleOwner
    private lateinit var lifecycle: LifecycleRegistry

    @get:Rule
    var rule: TestRule = RuleChain
        .outerRule(MainDispatcherRule(testDispatcher))
        .around(InstantTaskExecutorRule())

    @Before
    fun setup() {

        // Create a mock LifecycleOwner and its Lifecycle
        lifecycleOwner = mock(LifecycleOwner::class.java)
        lifecycle = LifecycleRegistry(lifecycleOwner)
        `when`(lifecycleOwner.lifecycle).thenReturn(lifecycle)
        lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_RESUME)

        // Mock the Log.d method
        mockkStatic(Log::class)
        every { Log.d(any(), any()) } returns 0
    }

    *//*    @Test
        fun datasource_results_filtered_for_null() = runBlocking {
            val mockRealEstate = MockRealEstate(4)
            val expectedResults = mockRealEstate.mockRealEstateList
            *//**//*val filteredMockRealEstate = filterRealEstateResults(expectedResults)

        // Assert
        assertEquals(filteredMockRealEstate.size, 1)*//**//*
    }*//*


    @Test
    fun load_restaurants_method_returns_restaurant_class() = runBlocking {
        val dataSource = DataSource

        dataSource.loadRealEstateList(lifecycleOwner.lifecycle.coroutineScope)
        assertTrue(realEstateList is List<ListingItem?>)
    }*/

}
