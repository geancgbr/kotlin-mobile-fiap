package com.fiap.fiap_mobile_app.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.fiap.fiap_mobile_app.database.dao.UserDao
import com.fiap.fiap_mobile_app.database.dao.HealthProfileDao
import com.fiap.fiap_mobile_app.database.dao.TrackingProfileDao
import com.fiap.fiap_mobile_app.model.User
import com.fiap.fiap_mobile_app.model.HealthProfile
import com.fiap.fiap_mobile_app.model.TrackingProfile

@Database(entities = [User::class, HealthProfile::class, TrackingProfile::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun healthProfileDao(): HealthProfileDao
    abstract fun trackingProfileDao(): TrackingProfileDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}

/*
- criacao de banco de dados room
 */