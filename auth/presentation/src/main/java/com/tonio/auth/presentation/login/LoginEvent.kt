package com.tonio.auth.presentation.login

import com.tonio.core.presentation.ui.UiText

sealed interface LoginEvent {
    data object LoginSuccess: LoginEvent

    data class Error(val error: UiText ) : LoginEvent
}