package br.com.gupy.fernando.data.remote.api

import retrofit2.http.GET

interface MarvelApi {
    @GET("/test")
    suspend fun fetchListOfCharacters() : Unit
}