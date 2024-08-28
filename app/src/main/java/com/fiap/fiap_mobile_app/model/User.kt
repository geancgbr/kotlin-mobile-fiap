package com.fiap.fiap_mobile_app.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "t_users")
data class User(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String = "",
    val phone: String = "",
    val email: String = "",
    val password: String = ""
)
/*
Modelo, Entidade do sistema que corresponde ao usuario do sistema.

 */