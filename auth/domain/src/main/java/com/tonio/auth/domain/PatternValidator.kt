package com.tonio.auth.domain

interface PatternValidator {
    fun matches(value: String): Boolean
}