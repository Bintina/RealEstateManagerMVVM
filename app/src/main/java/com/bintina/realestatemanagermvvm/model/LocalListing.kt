package com.bintina.realestatemanagermvvm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["listingId"], unique = true)])
data class LocalListing(
    @PrimaryKey(autoGenerate = false)
    val listingId: String = "",
    @ColumnInfo(name = "type")
    val type: String = "",
    @ColumnInfo(name = "price")
    val price: Double = 0.00,
    @ColumnInfo(name = "surfaceArea")
    val surfaceArea: Double = 0.00,
    @ColumnInfo(name = "numberOfRooms")
    val numberOfRooms: Int = 0,
    @ColumnInfo(name = "description")
    val description: String = "",
    @ColumnInfo(name = "photoUrl")
    val photoUrl: String = "",
    @ColumnInfo(name = "address")
    val address: String = "",
    @ColumnInfo(name = "pointsOfInterest")
    val pointsOfInterest: List<String?> = emptyList(),
    @ColumnInfo(name = "isAvailable")
    val isAvailable: Boolean = true,//available/sold status
    @ColumnInfo(name = "listedDate")
    val listedDate: String = "",
    @ColumnInfo(name = "dateSold")
    val dateSold: String? = null
    )
