package com.tonio.auth.presentation.login

sealed interface LoginAction {
    data object OnTogglePasswordVisibilityCheck: LoginAction
    data object OnLoginClick: LoginAction
    data object OnRegisterClick: LoginAction
}