package com.bintina.realestatemanagermvvm.realestate.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import com.bintina.realestatemanagermvvm.login.model.Agent
import java.util.Date

@Entity
data class ListingItem(
    @PrimaryKey(autoGenerate = true)
    val propertyId: Long,
    val type: String,
                       val usdPrice: Double,
                       val surfaceAreaM2: Double,
                       val numberOfRooms: Int,
                       val description: String,
                       val media: List<Media>,
                       val address: Location,
                       val pointsOfInterest: String,
                       val status: Int, //0 for available 1 for sold
                       val listedDate: Date,
                       val saleDate: Date?,
                       val agentInCharge: Agent
    )
