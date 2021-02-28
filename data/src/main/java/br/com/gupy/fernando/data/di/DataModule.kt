package br.com.gupy.fernando.data.di

import br.com.gupy.fernando.data.repository.MarvelRepositoryImpl
import br.com.gupy.fernando.domain.repository.MarvelRepository
import org.koin.dsl.module

val repositoryModule = module {
    single<MarvelRepository> { MarvelRepositoryImpl() }
}

val dataModule = listOf(repositoryModule, marvelApiModule)