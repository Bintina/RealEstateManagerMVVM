package com.bintina.realestatemanagermvvm.model

data class LocalListing(val type: String = "",
    val price: Double = 0.00,
    val surfaceArea: Double = 0.00,
    val numberOfRooms: Int = 0,
    val description: String = "",
    val photoUrl: String = "",
    val address: String = "",
    val pointsOfInterest: List<String?> = emptyList(),
    val available: Boolean = true,//available/sold status
    val listedDate: String = "",
    val dateSold: String? = null
    )
