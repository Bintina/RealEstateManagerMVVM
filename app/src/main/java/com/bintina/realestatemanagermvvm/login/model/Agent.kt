package com.bintina.realestatemanagermvvm.login.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity
class Agent(
    @PrimaryKey(autoGenerate = true)
    val agentId: Long,
    val agentName: String
) {

}
