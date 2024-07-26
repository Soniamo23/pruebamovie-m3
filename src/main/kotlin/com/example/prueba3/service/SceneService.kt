package com.example.prueba3.service


import com.example.prueba3.entity.Scene
import com.example.prueba3.repository.SceneRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class SceneService {
    @Autowired
    private lateinit var sceneRepository: SceneRepository
    fun list (): List<Scene>{
        return sceneRepository.findAll()
    }
    fun getById(id: Long) : Scene{
        return sceneRepository.findById(id).orElseThrow{ RuntimeException("scene not found!") }
    }
    fun save (scene: Scene):Scene{
        return sceneRepository.save(scene)
    }
    fun update(id: Long, scene: Scene):Scene{
        val existingScene = sceneRepository.findById(id).orElseThrow { RuntimeException("scene not found") }

        existingScene.description = scene.description
        existingScene.budget = scene.budget
        existingScene.minutes = scene.minutes
        existingScene.film = scene.film
        return sceneRepository.save(existingScene)
    }
    fun delete(id:Long){
        if (sceneRepository.existsById(id)){
            sceneRepository.deleteById(id)
        }else{
            throw RuntimeException("scene not found")
        }
    }
}
