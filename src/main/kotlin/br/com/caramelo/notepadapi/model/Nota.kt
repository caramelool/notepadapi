package br.com.caramelo.notepadapi.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Nota(@Id var id: String? = null,
                var titulo: String? = null,
                var conteudo: String? = null,
                var data: String? = null)