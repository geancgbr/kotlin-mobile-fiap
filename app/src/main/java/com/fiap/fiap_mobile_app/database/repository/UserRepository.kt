package com.fiap.fiap_mobile_app.database.repository

import com.fiap.fiap_mobile_app.database.dao.UserDao
import com.fiap.fiap_mobile_app.model.User

class UserRepository(private val userDao: UserDao) {

    suspend fun registerUser(user: User) {
        userDao.insertUser(user)
    }

    suspend fun loginUser(email: String, password: String): User? {
        return userDao.authenticateUser(email, password)
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    suspend fun getUserById(userId: Long): User? {
        return userDao.getUserById(userId)
    }

    suspend fun deleteUser(userId: Long) {
        userDao.deleteUser(userId)
    }
}

