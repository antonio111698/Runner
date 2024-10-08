package com.tonio.auth.presentation.di

import com.tonio.auth.presentation.login.LoginViewModel
import com.tonio.auth.presentation.register.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.dsl.module

val authViewModelModule = module {
    viewModelOf(::RegisterViewModel)
    viewModelOf(::LoginViewModel)
}