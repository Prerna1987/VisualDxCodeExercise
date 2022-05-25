package com.visualdx.codechallenge.repository

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.visualdx.codechallenge.network.ApiState
import com.visualdx.codechallenge.network.Currency
import com.visualdx.codechallenge.ui.customAdapter
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.*

class CurrencyViewModel constructor(private val mainRepository: CurrencyRepository) : ViewModel() {

    private val requestState: MutableStateFlow<ApiState> = MutableStateFlow(ApiState.Empty)
    val _requestState: StateFlow<ApiState> = requestState

    private val name: MutableStateFlow<String?> = MutableStateFlow(null)
    val _name: StateFlow<String?> = name

    private val code: MutableStateFlow<String?> = MutableStateFlow(null)
    val _code: StateFlow<String?> = code

    private val _currencyList = MutableStateFlow<List<Currency>>(listOf<Currency>())
    var currencyList: StateFlow<List<Currency>?> = _currencyList
    var searchCurrency = MutableStateFlow<String>("")
    var _dropAdapter = customAdapter(listOf());
    private val showError: MutableStateFlow<Boolean> = MutableStateFlow(false)
    val _showError: StateFlow<Boolean> = showError

    init {
        viewModelScope.launch {
            requestState.value = ApiState.Loading
            mainRepository.getCurrency()
                .catch { e ->
                    requestState.value = ApiState.Failure(e)
                    showError.value = true
                    return@catch
                }
                .combine(searchCurrency) { list, filter ->
                    list.filter {
                        it.name.startsWith(filter, true) || it.fullName.startsWith(filter, true)
                    }
                }
                .flowOn(Dispatchers.IO)
                .collect {
                    requestState.value = ApiState.Success(it)
                    _currencyList.value = it
                    if (it.isNotEmpty())
                        setAdapterData(it)
                    println(it.size)
                }
        }
    }

    private fun setAdapterData(it: List<Currency>) {
        _dropAdapter = customAdapter(it)
        _dropAdapter.notifyDataSetChanged()
    }

    fun setSelection(currency: Currency) {
        name.value = currency.name
        code.value = currency.fullName
    }

    var filter: String
        get() = searchCurrency.value
        set(value) {
            searchCurrency.value = value
        }

}