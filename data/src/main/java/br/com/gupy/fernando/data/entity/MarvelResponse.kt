package br.com.gupy.fernando.data.entity

data class MarvelResponse<T : Entity>(
    val code : Int,
    val etag : String,
    val data : Data<T>
)