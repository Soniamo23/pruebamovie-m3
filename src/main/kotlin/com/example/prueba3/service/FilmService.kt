package com.example.prueba3.service

import com.example.prueba3.entity.Film
import com.example.prueba3.repository.FilmRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class FilmService {
    @Autowired
    private lateinit var filmRepository: FilmRepository
    fun list (): List<Film>{
        return filmRepository.findAll()
    }
    fun getById(id: Long) : Film{
        return filmRepository.findById(id).orElseThrow{ RuntimeException("film not found!") }
    }
    fun save (film: Film):Film{
        return filmRepository.save(film)
    }
    fun update(id: Long, film: Film):Film{
        val existingFilm = filmRepository.findById(id).orElseThrow { RuntimeException("client not found") }

        existingFilm.title = film.title
        existingFilm.director = film.director
        existingFilm.duration = film.duration
        return filmRepository.save(existingFilm)
    }
    fun delete(id:Long){
        if (filmRepository.existsById(id)){
            filmRepository.deleteById(id)
        }else{
            throw RuntimeException("film not found")
        }
    }
}
