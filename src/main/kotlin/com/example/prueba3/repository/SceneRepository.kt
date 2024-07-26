package com.example.prueba3.repository

import com.example.prueba3.entity.Scene

import org.springframework.data.jpa.repository.JpaRepository

interface SceneRepository: JpaRepository<Scene, Long?> {
}