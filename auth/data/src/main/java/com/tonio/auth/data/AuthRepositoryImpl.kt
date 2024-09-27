package com.tonio.auth.data

import com.tonio.auth.domain.AuthRepository
import com.tonio.core.data.networking.post
import com.tonio.core.domain.AuthInfo
import com.tonio.core.domain.SessionStorage
import com.tonio.core.domain.util.DataError
import com.tonio.core.domain.util.EmptyResult
import com.tonio.core.domain.util.Result
import com.tonio.core.domain.util.asEmptyDataResult
import io.ktor.client.HttpClient
import io.ktor.client.request.post

class AuthRepositoryImpl(
    private val sessionStorage: SessionStorage,
    private val httpClient: HttpClient
): AuthRepository{
    override suspend fun login(email: String, password: String): EmptyResult<DataError.Network> {
        val result = httpClient.post<LoginRequest,LoginResponse>(
            route = "/login",
            body = LoginRequest(
                email = email,
                password = password
            )
        )
        if(result is Result.Success){
            sessionStorage.set(
                AuthInfo(
                    accessToken = result.data.accessToken,
                    refreshToken = result.data.refreshToken,
                    userId = result.data.userId
                )
            )
        }
        return result.asEmptyDataResult()
    }

    override suspend fun register(email: String, password: String): EmptyResult<DataError.Network> {
        return httpClient.post<RegisterRequest,Unit>(
            route = "/register",
            body = RegisterRequest(
                email = email,
                password = password
            )
        )
    }
}