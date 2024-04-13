package com.bintina.realestatemanagermvvm.login.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
class Agent(
    @PrimaryKey(autoGenerate = true)
    val agentId: Long,
    val agentName: String
) {

}
