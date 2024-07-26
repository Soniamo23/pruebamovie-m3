package com.example.prueba3.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name= "film")
class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    var id: Long? = null
    var title: String? = null
    var director: String? = null
    var duration: Int? = null

}