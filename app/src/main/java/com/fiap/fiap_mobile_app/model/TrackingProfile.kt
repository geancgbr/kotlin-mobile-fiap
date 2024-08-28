package com.fiap.fiap_mobile_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "t_tracking_profiles")
data class TrackingProfile(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val userId: Long,
    val waterIntake: Float,
    val lastNotificationSent: Long? = null,
    val trackingDate: Long = System.currentTimeMillis()
)

/*
Modelo, Entidade do sistema que corresponde ao perfil de rastreamento do usuario.
 */