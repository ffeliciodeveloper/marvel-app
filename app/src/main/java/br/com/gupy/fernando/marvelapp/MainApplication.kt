package br.com.gupy.fernando.marvelapp

import android.app.Application
import android.content.Context
import br.com.gupy.fernando.data.di.dataModule
import br.com.gupy.fernando.domain.di.domainModule
import br.com.gupy.fernando.marvelapp.internal.di.*
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@MainApplication)

            modules(domainModule + dataModule + presentationModule)
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
    }
}