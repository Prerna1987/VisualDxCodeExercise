package com.visualdx.codechallenge

import com.visualdx.codechallenge.network.Currency
import com.visualdx.codechallenge.network.EndPointAPI
import com.visualdx.codechallenge.utils.Constants
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.ArrayList

class ServiceTest {

    lateinit var service: EndPointAPI

    @Before
    internal fun setUp() {
        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.BaseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        service = retrofit.create(EndPointAPI::class.java)
    }

    @Test
    internal fun should_callServiceWithCoroutine() {
        runBlocking {
            flow<ArrayList<Currency>> {
                emit(service.getCurrency().data)
            }.flowOn(Dispatchers.IO)
                .collect {
                    it.forEach(::println)
                }
        }


    }
}