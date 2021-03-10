package com.hamaar.capstonedicoding

import android.app.Application
import com.hamaar.capstonedicoding.core.di.databaseModule
import com.hamaar.capstonedicoding.core.di.networkModule
import com.hamaar.capstonedicoding.core.di.repositoryModule
import com.hamaar.capstonedicoding.di.useCaseModule
import com.hamaar.capstonedicoding.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    useCaseModule,
                    viewModelModule
                )
            )
        }
    }
}
