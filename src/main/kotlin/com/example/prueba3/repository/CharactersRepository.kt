package com.example.prueba3.repository


import com.example.prueba3.entity.Character

import org.springframework.data.jpa.repository.JpaRepository


interface CharactersRepository: JpaRepository<Character, Long?> {
}