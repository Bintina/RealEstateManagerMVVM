package com.bintina.realestatemanagermvvm.model

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation

data class ListingWithUser(
    @Embedded val listing: LocalListing = LocalListing(),
    @Relation(
        parentColumn = "listingId",
        entityColumn = "uid",
        associateBy = Junction(UserListingCrossRef::class)
    )
    val user: LocalUser = LocalUser()
)
