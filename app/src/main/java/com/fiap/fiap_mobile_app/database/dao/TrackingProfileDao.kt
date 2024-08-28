package com.fiap.fiap_mobile_app.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.fiap.fiap_mobile_app.model.TrackingProfile

@Dao
interface TrackingProfileDao {
    @Insert
    suspend fun insertTrackingProfile(profile: TrackingProfile)

    @Update
    suspend fun updateTrackingProfile(profile: TrackingProfile)

    @Query("SELECT * FROM t_tracking_profiles WHERE userId = :userId")
    suspend fun getTrackingProfileByUserId(userId: Long): TrackingProfile?
}
