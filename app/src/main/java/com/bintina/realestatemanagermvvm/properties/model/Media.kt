package com.bintina.realestatemanagermvvm.properties.model

import android.arch.persistence.room.Entity

@Entity
class Media(val imageType: String, val imageUrl: String, val description: String) {

}
