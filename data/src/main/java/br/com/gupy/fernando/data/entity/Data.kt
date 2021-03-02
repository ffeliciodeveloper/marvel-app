package br.com.gupy.fernando.data.entity

data class Data<T : Entity>(
    val offset: Int,
    val limit: Int,
    val total: Int,
    val count: Int,
    val results: List<T>
)