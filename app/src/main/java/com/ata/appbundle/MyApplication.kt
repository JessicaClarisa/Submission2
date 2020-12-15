package com.ata.appbundle

import android.app.Application
import com.ata.appbundle.core.di.databaseModule
import com.ata.appbundle.core.di.networkModule
import com.ata.appbundle.core.di.repositoryModule
import com.ata.appbundle.di.useCaseModule
import com.ata.appbundle.di.viewModelModule
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