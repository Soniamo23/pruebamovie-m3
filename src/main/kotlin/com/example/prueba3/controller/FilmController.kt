package com.example.prueba3.controller

import com.example.prueba3.entity.Film

import com.example.prueba3.service.FilmService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/films")
class FilmController {
    @Autowired
    lateinit var filmService: FilmService

    @GetMapping
    fun list(): List<Film> {
        return  filmService.list()

    }
    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Film {
        return filmService.getById(id)
    }
    @PostMapping
    fun save(@RequestBody film: Film):Film{
        return filmService.save(film)
    }
    @PutMapping("/{id}")
    fun updateFilm(@PathVariable id: Long, @RequestBody film: Film):Film {
        return filmService.update(id, film)
    }
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id:Long):String {
        filmService.delete(id)
        return "film $id deleted"
    }
}