package com.visualdx.codechallenge.di

import com.visualdx.codechallenge.network.EndPointAPI
import com.visualdx.codechallenge.utils.Constants
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class NetworkModule {

    @Singleton
    @Provides
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Singleton
    @Provides
    fun provideEndpointAPI(retrofit: Retrofit): EndPointAPI {
        return retrofit.create(EndPointAPI::class.java)
    }

}