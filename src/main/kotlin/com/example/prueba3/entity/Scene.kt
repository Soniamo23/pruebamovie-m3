package com.example.prueba3.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name= "scene")
class Scene {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    var description: String? = null
    var budget: Double? = null
    var minutes: Int? = null

    @ManyToOne
    @JoinColumn(name = "filmid")
    var film: Film? = null

}