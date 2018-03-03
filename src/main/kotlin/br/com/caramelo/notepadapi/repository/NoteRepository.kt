package br.com.caramelo.notepadapi.repository

import br.com.caramelo.notepadapi.model.Note
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query
import org.springframework.stereotype.Repository
import java.util.stream.Stream

@Repository
interface NoteRepository : MongoRepository<Note, String> {
    @Query("{}")
    fun all(): Stream<Note>

    fun findById(id: String): Note?
}