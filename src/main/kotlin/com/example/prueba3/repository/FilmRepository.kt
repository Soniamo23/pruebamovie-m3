package com.example.prueba3.repository


import com.example.prueba3.entity.Film
import org.springframework.data.jpa.repository.JpaRepository

interface FilmRepository: JpaRepository <Film, Long?> {
}