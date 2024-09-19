package com.tonio.core.data.networking.di

import com.tonio.core.data.auth.EncryptedSessionStorage
import com.tonio.core.data.networking.HttpClientFactory
import com.tonio.core.domain.SessionStorage
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val coreDataModule = module {
    single {
        HttpClientFactory().build()
    }
    singleOf(::EncryptedSessionStorage).bind<SessionStorage>()
}