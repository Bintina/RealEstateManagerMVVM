package com.bintina.realestatemanagermvvm.model.database

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.bintina.realestatemanagermvvm.model.LocalListing
import com.bintina.realestatemanagermvvm.model.LocalUser
import com.bintina.realestatemanagermvvm.model.UserListingCrossRef

data class ListingWithUser(
    @Embedded val listing: LocalListing = LocalListing(),
    @Relation(
        parentColumn = "listingId",
        entityColumn = "uid",
        associateBy = Junction(UserListingCrossRef::class)
    )
    val user: LocalUser = LocalUser()
)
