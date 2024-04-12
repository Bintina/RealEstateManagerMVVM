package com.bintina.realestatemanagermvvm.model

import java.util.Date

data class ListingItem(val type: String, val usdPrice: Double, val surfaceAreaM2: Double,
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
