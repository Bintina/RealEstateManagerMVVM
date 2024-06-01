package com.bintina.realestatemanagermvvm.login.model.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.bintina.realestatemanagermvvm.login.model.Agent

@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun createUser(user: Agent)

    @Query("SELECT * FROM Agent WHERE agentId = :userId")
    fun getUser(userId: Long): Agent
}