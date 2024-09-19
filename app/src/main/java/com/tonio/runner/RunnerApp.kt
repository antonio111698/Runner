package com.tonio.runner

import android.app.Application
import com.tonio.auth.data.di.authDataModule
import com.tonio.auth.presentation.di.authViewModelModule
import com.tonio.core.data.networking.di.coreDataModule
import com.tonio.runner.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.logger.AndroidLogger
import org.koin.core.context.startKoin
import timber.log.Timber

class RunnerApp: Application() {

    override fun onCreate() {
        super.onCreate()
        if(BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }

        startKoin {
            AndroidLogger()
            androidContext(this@RunnerApp)
            modules(
                authDataModule,
                authViewModelModule,
                appModule,
                coreDataModule
            )
        }
    }
}