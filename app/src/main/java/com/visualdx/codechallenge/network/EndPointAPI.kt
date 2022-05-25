package com.visualdx.codechallenge.network

import retrofit2.http.GET

interface EndPointAPI {

    @GET("currencies")
    suspend fun getCurrency() : data
}