package br.com.gupy.fernando.domain.di

import br.com.gupy.fernando.domain.usecases.FetchListOfCharactersUseCase
import org.koin.dsl.module

val useCaseModule = module {
    single { FetchListOfCharactersUseCase(marvelRepository = get()) }
}

val domainModule = listOf(useCaseModule)