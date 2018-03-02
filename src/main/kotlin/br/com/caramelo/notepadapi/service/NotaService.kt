package br.com.caramelo.notepadapi.service

import br.com.caramelo.notepadapi.model.Nota
import br.com.caramelo.notepadapi.repository.NotaRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NotaService {

    @Autowired
    lateinit var repository: NotaRepository

    fun salvar(nota: Nota) : Nota {
        return repository.save(nota)
    }

    fun buscarTodas(): List<Nota> {
        return repository.findAll()
    }

    fun buscar(id: String): Nota? {
        return repository.findById(id)
    }
}