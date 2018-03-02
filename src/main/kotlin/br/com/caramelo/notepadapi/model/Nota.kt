package br.com.caramelo.notepadapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Nota {
    @Id var id: String? = null
    var titulo: String? = null
        get() = field ?: "(sem titulo)"
    var conteudo: String? = null
        get() = field ?: ""
}