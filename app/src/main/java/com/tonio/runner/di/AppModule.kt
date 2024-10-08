package com.tonio.runner.di


import android.content.SharedPreferences
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKey
import com.tonio.auth.data.EmailPatternValidator
import com.tonio.auth.domain.PatternValidator
import com.tonio.auth.domain.UserDataValidator
import org.koin.android.ext.koin.androidApplication
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val appModule = module {
    single<SharedPreferences> {
        EncryptedSharedPreferences(
            androidApplication(),
            "auth_pref",
            MasterKey(androidApplication()),
            EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
            EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM

        )
    }
}