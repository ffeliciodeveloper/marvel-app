package br.com.gupy.fernando.data.api

class MarvelApi(private val marvelService: MarvelService) : MarvelService {
    override suspend fun fetchListOfCharacters(hashSignature: String, limit: Int, offset: Int, apikey: String) {
        marvelService.fetchListOfCharacters(hashSignature, limit, offset, apikey)
    }
}