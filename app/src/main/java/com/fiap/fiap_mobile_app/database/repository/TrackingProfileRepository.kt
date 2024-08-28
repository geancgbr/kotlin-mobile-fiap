package com.fiap.fiap_mobile_app.database.repository

import com.fiap.fiap_mobile_app.database.dao.TrackingProfileDao
import com.fiap.fiap_mobile_app.model.TrackingProfile

class TrackingProfileRepository(private val trackingProfileDao: TrackingProfileDao) {

    suspend fun insertTrackingProfile(profile: TrackingProfile) {
        trackingProfileDao.insertTrackingProfile(profile)
    }

    suspend fun updateTrackingProfile(profile: TrackingProfile) {
        trackingProfileDao.updateTrackingProfile(profile)
    }

    suspend fun getTrackingProfileByUserId(userId: Long): TrackingProfile? {
        return trackingProfileDao.getTrackingProfileByUserId(userId)
    }
}
