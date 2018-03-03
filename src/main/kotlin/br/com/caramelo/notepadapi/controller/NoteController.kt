package br.com.caramelo.notepadapi.controller

import br.com.caramelo.notepadapi.model.Note
import br.com.caramelo.notepadapi.service.NoteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/note")
class NoteController {

    @Autowired
    lateinit var service: NoteService

    @GetMapping
    fun findAll(): List<Note> {
        return service.findAll()
    }

    @GetMapping("/{id}")
    fun find(@PathVariable("id") id: String): Note? {
        return service.find(id)
    }

    @PostMapping
    fun save(@RequestBody note: Note): Note {
        return service.save(note)
    }

    @DeleteMapping
    fun delete(@RequestBody note: Note): Note? {
        service.delete(note)
        return note
    }
}