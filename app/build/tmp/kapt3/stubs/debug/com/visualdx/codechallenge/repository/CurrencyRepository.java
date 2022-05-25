package com.visualdx.codechallenge.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/visualdx/codechallenge/repository/CurrencyRepository;", "", "endPointAPI", "Lcom/visualdx/codechallenge/network/EndPointAPI;", "(Lcom/visualdx/codechallenge/network/EndPointAPI;)V", "getCurrency", "Lkotlinx/coroutines/flow/Flow;", "Ljava/util/ArrayList;", "Lcom/visualdx/codechallenge/network/Currency;", "app_debug"})
public final class CurrencyRepository {
    private final com.visualdx.codechallenge.network.EndPointAPI endPointAPI = null;
    
    @javax.inject.Inject()
    public CurrencyRepository(@org.jetbrains.annotations.NotNull()
    com.visualdx.codechallenge.network.EndPointAPI endPointAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<java.util.ArrayList<com.visualdx.codechallenge.network.Currency>> getCurrency() {
        return null;
    }
}