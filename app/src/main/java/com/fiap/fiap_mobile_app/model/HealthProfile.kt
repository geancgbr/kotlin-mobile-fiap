package com.fiap.fiap_mobile_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "t_health_profiles")
data class HealthProfile (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val userId: Long,
    val weight: Double,
    val height: Double,
    val physicalActivityLevel: PhysicalActivityLevel,
    val mobilityIssues: Boolean
)

/*
Modelo, Entidade do sistema que corresponde ao perfil de saude do usuario.
 */
