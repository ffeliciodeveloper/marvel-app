package br.com.gupy.fernando.data.di

import br.com.gupy.fernando.data.api.MarvelApi
import br.com.gupy.fernando.data.api.MarvelService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

const val TIMEOUT : Long = 30L

val marvelApiModule = module {
    factory { providesOkHttpClient() }

    single {
        marvelServiceApi<MarvelService>(
            okHttpClient = get(),
            url = "https://gateway.marvel.com:443/v1/public"
        )
    }

    single { MarvelApi(marvelService = get()) }
}

fun providesOkHttpClient() : OkHttpClient {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.level = HttpLoggingInterceptor.Level.BASIC

    return OkHttpClient.Builder()
        .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
        .readTimeout(TIMEOUT, TimeUnit.SECONDS)
        .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
        .addInterceptor(loggingInterceptor)
        .build()
}

inline fun <reified T> marvelServiceApi(okHttpClient: OkHttpClient, url: String) : T {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(url)
        .client(okHttpClient)
        .build()
        .create(T::class.java)
}