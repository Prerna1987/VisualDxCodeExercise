package com.visualdx.codechallenge.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010/\u001a\u0002002\f\u00101\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\u000e\u00102\u001a\u0002002\u0006\u00103\u001a\u00020\rR\u0019\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\tR\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\tR\u0016\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010 R$\u0010\"\u001a\u00020\u00072\u0006\u0010!\u001a\u00020\u00078F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00170\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/visualdx/codechallenge/repository/CurrencyViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/visualdx/codechallenge/repository/CurrencyRepository;", "(Lcom/visualdx/codechallenge/repository/CurrencyRepository;)V", "_code", "Lkotlinx/coroutines/flow/StateFlow;", "", "get_code", "()Lkotlinx/coroutines/flow/StateFlow;", "_currencyList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/visualdx/codechallenge/network/Currency;", "_dropAdapter", "Lcom/visualdx/codechallenge/ui/customAdapter;", "get_dropAdapter", "()Lcom/visualdx/codechallenge/ui/customAdapter;", "set_dropAdapter", "(Lcom/visualdx/codechallenge/ui/customAdapter;)V", "_name", "get_name", "_requestState", "Lcom/visualdx/codechallenge/network/ApiState;", "get_requestState", "_showError", "", "get_showError", "code", "currencyList", "getCurrencyList", "setCurrencyList", "(Lkotlinx/coroutines/flow/StateFlow;)V", "value", "filter", "getFilter", "()Ljava/lang/String;", "setFilter", "(Ljava/lang/String;)V", "name", "requestState", "searchCurrency", "getSearchCurrency", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "setSearchCurrency", "(Lkotlinx/coroutines/flow/MutableStateFlow;)V", "showError", "setAdapterData", "", "it", "setSelection", "currency", "app_debug"})
public final class CurrencyViewModel extends androidx.lifecycle.ViewModel {
    private final com.visualdx.codechallenge.repository.CurrencyRepository mainRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.visualdx.codechallenge.network.ApiState> requestState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.visualdx.codechallenge.network.ApiState> _requestState = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> name = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> _name = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> code = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> _code = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.visualdx.codechallenge.network.Currency>> _currencyList = null;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.visualdx.codechallenge.network.Currency>> currencyList;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> searchCurrency;
    @org.jetbrains.annotations.NotNull()
    private com.visualdx.codechallenge.ui.customAdapter _dropAdapter;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> showError = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> _showError = null;
    
    public CurrencyViewModel(@org.jetbrains.annotations.NotNull()
    com.visualdx.codechallenge.repository.CurrencyRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.visualdx.codechallenge.network.ApiState> get_requestState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> get_name() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> get_code() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.visualdx.codechallenge.network.Currency>> getCurrencyList() {
        return null;
    }
    
    public final void setCurrencyList(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.StateFlow<? extends java.util.List<com.visualdx.codechallenge.network.Currency>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> getSearchCurrency() {
        return null;
    }
    
    public final void setSearchCurrency(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.visualdx.codechallenge.ui.customAdapter get_dropAdapter() {
        return null;
    }
    
    public final void set_dropAdapter(@org.jetbrains.annotations.NotNull()
    com.visualdx.codechallenge.ui.customAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.lang.Boolean> get_showError() {
        return null;
    }
    
    private final void setAdapterData(java.util.List<com.visualdx.codechallenge.network.Currency> it) {
    }
    
    public final void setSelection(@org.jetbrains.annotations.NotNull()
    com.visualdx.codechallenge.network.Currency currency) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilter() {
        return null;
    }
    
    public final void setFilter(@org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
}