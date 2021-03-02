package br.com.gupy.fernando.data.entity.character

import br.com.gupy.fernando.data.entity.Entity

data class Character(
    val id: Int,
    val name: String,
    val description: String,
    val path: String,
    val extension: String
) : Entity