package com.visualdx.codechallenge.network

sealed class ApiState{

    object Loading: ApiState()
    object Empty: ApiState()
    class Failure(val msg: Throwable): ApiState()
    class Success(val data: List<Currency>): ApiState()

}

