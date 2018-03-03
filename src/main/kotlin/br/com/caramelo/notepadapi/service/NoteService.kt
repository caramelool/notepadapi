package br.com.caramelo.notepadapi.service

import br.com.caramelo.notepadapi.model.Note
import br.com.caramelo.notepadapi.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NoteService {

    @Autowired
    lateinit var repository: NoteRepository

    fun save(note: Note): Note {
        return repository.save(note)
    }

    fun findAll(): List<Note> {
        return repository.findAll()
    }

    fun find(id: String): Note? {
        return repository.findById(id)
    }

    fun delete(note: Note) {
        repository.delete(note)
    }
}