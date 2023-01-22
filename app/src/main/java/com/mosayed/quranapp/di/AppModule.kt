package com.mosayed.quranapp.di

import com.mosayed.quranapp.data.remote.QuranService
import com.mosayed.quranapp.data.remote.QuranServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.client.engine.android.Android
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logging
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideQuranService(): QuranService{
        return QuranServiceImpl(
            client = HttpClient(Android){
                install(Logging){
                    level = LogLevel.ALL
                }
//                install(JsonFeature){
//
//                }
            }
        )
    }
}