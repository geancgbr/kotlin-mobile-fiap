package com.fiap.fiap_mobile_app.database.repository

import com.fiap.fiap_mobile_app.database.dao.HealthProfileDao
import com.fiap.fiap_mobile_app.model.HealthProfile

class HealthProfileRepository(private val healthProfileDao: HealthProfileDao) {

    suspend fun insertHealthProfile(profile: HealthProfile) {
        healthProfileDao.insertHealthProfile(profile)
    }

    suspend fun updateHealthProfile(profile: HealthProfile) {
        healthProfileDao.updateHealthProfile(profile)
    }

    suspend fun getHealthProfileByUserId(userId: Long): HealthProfile? {
        return healthProfileDao.getHealthProfileByUserId(userId)
    }
}
