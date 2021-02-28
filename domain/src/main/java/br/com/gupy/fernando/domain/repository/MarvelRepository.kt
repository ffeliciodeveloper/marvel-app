package br.com.gupy.fernando.domain.repository

interface MarvelRepository {
    fun fetchListOfCharacters(limit : Int);
    fun fetchCharacterDetail(character : Int);
    fun fetchComicOfCharacter(character : Int);
}