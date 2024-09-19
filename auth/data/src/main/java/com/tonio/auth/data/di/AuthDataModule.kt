package com.tonio.auth.data.di

import com.tonio.auth.data.AuthRepositoryImpl
import com.tonio.auth.data.EmailPatternValidator
import com.tonio.auth.domain.AuthRepository
import com.tonio.auth.domain.PatternValidator
import com.tonio.auth.domain.UserDataValidator
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

val authDataModule = module {
    single<PatternValidator> {
        EmailPatternValidator
    }
    singleOf(::UserDataValidator)
    singleOf(::AuthRepositoryImpl).bind<AuthRepository>()
}