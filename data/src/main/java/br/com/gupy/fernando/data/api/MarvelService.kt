package br.com.gupy.fernando.data.api

import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {
    @GET("/characters")
    suspend fun fetchListOfCharacters(
        @Query("hash") hashSignature : String,
        @Query("limit") limit : Int,
        @Query("offset") offset : Int,
        @Query("apikey") apikey : String
    )
}