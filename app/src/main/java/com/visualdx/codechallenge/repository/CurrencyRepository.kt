package com.visualdx.codechallenge.repository

import com.visualdx.codechallenge.network.Currency
import com.visualdx.codechallenge.network.EndPointAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.util.ArrayList
import javax.inject.Inject

class CurrencyRepository @Inject constructor(private val endPointAPI: EndPointAPI) {

    fun getCurrency(): Flow<ArrayList<Currency>> = flow<ArrayList<Currency>>{
        emit(endPointAPI.getCurrency().data)
    }.flowOn(Dispatchers.IO)


}