package com.example.prueba3.controller

import com.example.prueba3.entity.Character
import com.example.prueba3.service.CharactersService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/characters")
class CharactersController {
    @Autowired
    lateinit var charactersService: CharactersService

    @GetMapping
    fun list(): List<Character> {
        return charactersService.list()
    }

    @GetMapping("/{id}")
    fun getById(@PathVariable id: Long): Character {
        return charactersService.getById(id)
    }

    @PostMapping
    fun save(@RequestBody character: Character): Character {
        return charactersService.save(character)
    }

    @PutMapping("/{id}")
    fun updateCharacter(@PathVariable id: Long, @RequestBody character: Character): Character {
        return charactersService.update(id, character)
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long): String {
        charactersService.delete(id)
        return "Character $id deleted"
    }
}
