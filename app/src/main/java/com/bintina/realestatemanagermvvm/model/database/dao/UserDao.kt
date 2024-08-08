package com.bintina.realestatemanagermvvm.model.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.bintina.realestatemanagermvvm.model.LocalUser

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(localUser: LocalUser)

    @Update
    suspend fun updateUser(localUser: LocalUser)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(usersList: List<LocalUser>)

    @Query("SELECT * FROM LocalUser")
    fun getAllUsers(): MutableList<LocalUser>

    @Query("SELECT * FROM LocalUser WHERE uid = :uid")
    suspend fun getUserById(uid: String): LocalUser

    @Delete
    suspend fun deleteUser(localUser: LocalUser)
}