package br.com.gupy.fernando.data.repository

import br.com.gupy.fernando.data.api.MarvelApi
import br.com.gupy.fernando.domain.repository.MarvelRepository

class MarvelRepositoryImpl(private val marvelApi: MarvelApi) : MarvelRepository {
    override suspend fun fetchListOfCharacters(limit: Int) {
        marvelApi.fetchListOfCharacters()
    }

    override suspend fun fetchCharacterDetail(character: Int) {
        TODO("Not yet implemented")
    }

    override suspend fun fetchComicOfCharacter(character: Int) {
        TODO("Not yet implemented")
    }
}