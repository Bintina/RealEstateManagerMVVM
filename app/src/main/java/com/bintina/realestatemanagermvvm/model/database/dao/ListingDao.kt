package com.bintina.realestatemanagermvvm.model.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.bintina.realestatemanagermvvm.model.LocalListing

@Dao
interface ListingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertListing(listingItem: LocalListing)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract fun insertAll(listingsList: List<LocalListing>)

    @Update
    suspend fun updateListing(listingItem: LocalListing)

    @Query("SELECT * FROM LocalListing WHERE listingId = :listingId")
    fun getListing(listingId: String): LocalListing

    @Query("SELECT * FROM LocalListing")
    fun getAllListings(): MutableList<LocalListing>

    @Delete
    fun deleteRestaurant(listingItem: LocalListing)


}