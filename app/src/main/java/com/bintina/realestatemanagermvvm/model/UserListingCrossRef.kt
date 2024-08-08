package com.bintina.realestatemanagermvvm.model

import androidx.room.Entity

@Entity(primaryKeys = ["uid", "listingId"])
data class UserListingCrossRef(
    val uid: String = "",
    val listingId: String = ""
)
