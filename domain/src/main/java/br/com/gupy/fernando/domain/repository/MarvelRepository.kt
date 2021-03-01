package br.com.gupy.fernando.domain.repository

interface MarvelRepository {
    suspend fun fetchListOfCharacters(limit : Int);
    suspend fun fetchCharacterDetail(character : Int);
    suspend fun fetchComicOfCharacter(character : Int);
}