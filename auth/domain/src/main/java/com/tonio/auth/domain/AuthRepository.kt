package com.tonio.auth.domain

import com.tonio.core.domain.util.DataError
import com.tonio.core.domain.util.EmptyResult

interface AuthRepository {
    suspend fun register(email: String, password:String): EmptyResult<DataError.Network>
}