package br.com.caramelo.notepadapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Note {
    @Id var id: String? = null
    var title: String? = null
        get() = field ?: "(sem titulo)"
    var content: String? = null
        get() = field ?: ""
}