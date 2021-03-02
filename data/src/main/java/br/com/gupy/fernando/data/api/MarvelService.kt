package br.com.gupy.fernando.data.api

import br.com.gupy.fernando.data.entity.character.Character
import br.com.gupy.fernando.data.entity.MarvelResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MarvelService {
    @GET("/characters")
    suspend fun fetchListOfCharacters(
        @Query("hash") hashSignature : String,
        @Query("limit") limit : Int,
        @Query("offset") offset : Int,
        @Query("apikey") apikey : String
    ) : MarvelResponse<Character>
}