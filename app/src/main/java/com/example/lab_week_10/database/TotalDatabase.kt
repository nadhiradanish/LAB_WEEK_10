package com.example.lab_week_10.database

import androidx.room.Database
import androidx.room.RoomDatabase

// Update the version when you try to change the schema
@Database(entities = [Total::class], version = 1)
abstract class TotalDatabase : RoomDatabase() {
    // Declare the Dao
    abstract fun totalDao(): TotalDao
// You can declare another Dao here for other Entities
}
