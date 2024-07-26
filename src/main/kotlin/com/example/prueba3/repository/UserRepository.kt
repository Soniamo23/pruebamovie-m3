package com.example.prueba3.repository

import com.example.prueba3.entity.UserEntity
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository:JpaRepository <UserEntity, Long?> {
    fun findByUsername(username: String): UserEntity?

}