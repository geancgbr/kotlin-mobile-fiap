package com.fiap.fiap_mobile_app.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.fiap.fiap_mobile_app.model.HealthProfile

@Dao
interface HealthProfileDao {
    @Insert
    suspend fun insertHealthProfile(profile: HealthProfile)

    @Update
    suspend fun updateHealthProfile(profile: HealthProfile)

    @Query("SELECT * FROM t_health_profiles WHERE userId = :userId")
    suspend fun getHealthProfileByUserId(userId: Long): HealthProfile?
}
