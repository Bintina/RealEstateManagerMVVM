package com.bintina.realestatemanagermvvm.model.database.repositories

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.bintina.realestatemanagermvvm.model.LocalListing
import com.bintina.realestatemanagermvvm.model.LocalUser
import com.bintina.realestatemanagermvvm.model.database.dao.ListingDao
import com.bintina.realestatemanagermvvm.model.database.dao.UserDao

@Database(entities = [LocalUser::class, LocalListing::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun listingDao(): ListingDao

    companion object{
        @Volatile
        private var instance: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase{
            return instance ?: synchronized(this) {
                val newInstance = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "app_database"
                )
                    .fallbackToDestructiveMigrationFrom(1)
                    .build()
                instance = newInstance
                newInstance
            }
        }
    }
}