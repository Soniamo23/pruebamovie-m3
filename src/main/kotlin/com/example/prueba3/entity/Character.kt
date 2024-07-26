package com.example.prueba3.entity

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name= "characters")
class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    var id: Long? = null

    var fullname: String? = null
    var description: String? = null
    var cost: Double? = null
    var stock: Int? = null

    @ManyToOne
    @JoinColumn(name = "scene_id")
    var scene: Scene? = null
}