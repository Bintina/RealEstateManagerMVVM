package com.bintina.realestatemanagermvvm

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider.getApplicationContext
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.bintina.realestatemanagermvvm.model.LocalListing
import com.bintina.realestatemanagermvvm.model.database.repositories.AppDatabase
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LocalListingDaoInstrumentedTest {

    private var database: AppDatabase? = null

    @Rule
    @JvmField
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Before
    @Throws(Exception::class)
    fun initDb(){
        this.database = Room.inMemoryDatabaseBuilder(
            getApplicationContext(),
            AppDatabase::class.java
        )
            .allowMainThreadQueries()
            .build()
    }

    @After
    @Throws(Exception::class)
    fun closeDb(){
        database?.close()
    }

    //Test Data Set
    private val LOCAL_LISTING_DEMO = LocalListing("105", "Bungalo", 12.00, 3.00, 3, "Spacious Three bedroom on the beach","sampleurl.com","Diani Beach Road, behind Bazaar", listOf("spacious","incredible view", "all rooms ensuite"),true, "01.03.2024", null)
}