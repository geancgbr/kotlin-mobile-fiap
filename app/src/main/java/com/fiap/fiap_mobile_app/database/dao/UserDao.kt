package com.fiap.fiap_mobile_app.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.fiap.fiap_mobile_app.model.User

@Dao
interface UserDao {
    @Insert
    suspend fun insertUser(user: User)

    @Update
    suspend fun updateUser(user: User)

    @Query("SELECT * FROM t_users WHERE id = :userId")
    suspend fun getUserById(userId: Long): User?

    @Query("DELETE FROM t_users WHERE id = :userId")
    suspend fun deleteUser(userId: Long)

    @Query("SELECT * FROM t_users WHERE email = :email AND password = :password LIMIT 1")
    suspend fun authenticateUser(email: String, password: String): User?
}

/*
- Interface DAO seguindo os padroes MVVN utilizando o banco local Room.
- utilização de *suspend* para excecução de funcao em uma thread separada visando melhor perfomance nas querys
- autenticacao usando sql (se o usuario tiver o email e a senha correspondente no banco de dados)
 */
