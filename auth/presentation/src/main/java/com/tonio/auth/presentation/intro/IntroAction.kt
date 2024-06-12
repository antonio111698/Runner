package com.tonio.auth.presentation.intro

sealed interface IntroAction {
    data object  OnSignInClick: IntroAction
    data object OnSignUpClick: IntroAction
}