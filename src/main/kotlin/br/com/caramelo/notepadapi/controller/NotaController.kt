package br.com.caramelo.notepadapi.controller

import br.com.caramelo.notepadapi.model.Nota
import br.com.caramelo.notepadapi.service.NotaService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin
@RequestMapping("/nota")
class NotaController {
    @Autowired
    lateinit var service: NotaService

    @GetMapping
    fun buscarTodos(): List<Nota> {
        return service.buscarTodas()
    }

    @GetMapping("/titulo/{titulo}")
    fun buscar(@PathVariable("titulo") titulo: String): Nota? {
        return service.buscar(titulo)
    }

    @PostMapping
    fun salvar(@RequestBody nota: Nota) {
        service.salvar(nota)
    }
}