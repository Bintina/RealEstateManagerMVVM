package com.bintina.realestatemanagermvvm.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["uid"], unique = true)])
data class LocalUser(
    @PrimaryKey(autoGenerate = false) val uid: String = "",
    @ColumnInfo(name = "name")
                     val name: String= "",
    @ColumnInfo(name = "isAgent")
    var isAgent: Boolean = false)







