package com.example.prueba3.service

import com.example.prueba3.entity.Character
import com.example.prueba3.repository.CharactersRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CharactersService {
    @Autowired
    private lateinit var charactersRepository: CharactersRepository

    fun list(): List<Character> {
        return charactersRepository.findAll()
    }

    fun getById(id: Long): Character {
        return charactersRepository.findById(id).orElseThrow { RuntimeException("Character not found!") }
    }

    fun save(character: Character): Character {
        return charactersRepository.save(character)
    }

    fun update(id: Long, character: Character): Character {
        val existingCharacter = charactersRepository.findById(id).orElseThrow { RuntimeException("Character not found") }
        existingCharacter.fullname = character.fullname
        existingCharacter.description = character.description
        existingCharacter.cost = character.cost
        existingCharacter.stock = character.stock
        existingCharacter.scene = character.scene
        return charactersRepository.save(existingCharacter)
    }

    fun delete(id: Long) {
        if (charactersRepository.existsById(id)) {
            charactersRepository.deleteById(id)
        } else {
            throw RuntimeException("Character not found")
        }
    }
}
