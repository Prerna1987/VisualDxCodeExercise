package com.visualdx.codechallenge.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/visualdx/codechallenge/network/ApiState;", "", "()V", "Empty", "Failure", "Loading", "Success", "Lcom/visualdx/codechallenge/network/ApiState$Loading;", "Lcom/visualdx/codechallenge/network/ApiState$Empty;", "Lcom/visualdx/codechallenge/network/ApiState$Failure;", "Lcom/visualdx/codechallenge/network/ApiState$Success;", "app_debug"})
public abstract class ApiState {
    
    private ApiState() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/visualdx/codechallenge/network/ApiState$Loading;", "Lcom/visualdx/codechallenge/network/ApiState;", "()V", "app_debug"})
    public static final class Loading extends com.visualdx.codechallenge.network.ApiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.visualdx.codechallenge.network.ApiState.Loading INSTANCE = null;
        
        private Loading() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/visualdx/codechallenge/network/ApiState$Empty;", "Lcom/visualdx/codechallenge/network/ApiState;", "()V", "app_debug"})
    public static final class Empty extends com.visualdx.codechallenge.network.ApiState {
        @org.jetbrains.annotations.NotNull()
        public static final com.visualdx.codechallenge.network.ApiState.Empty INSTANCE = null;
        
        private Empty() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/visualdx/codechallenge/network/ApiState$Failure;", "Lcom/visualdx/codechallenge/network/ApiState;", "msg", "", "(Ljava/lang/Throwable;)V", "getMsg", "()Ljava/lang/Throwable;", "app_debug"})
    public static final class Failure extends com.visualdx.codechallenge.network.ApiState {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.Throwable msg = null;
        
        public Failure(@org.jetbrains.annotations.NotNull()
        java.lang.Throwable msg) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Throwable getMsg() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/visualdx/codechallenge/network/ApiState$Success;", "Lcom/visualdx/codechallenge/network/ApiState;", "data", "", "Lcom/visualdx/codechallenge/network/Currency;", "(Ljava/util/List;)V", "getData", "()Ljava/util/List;", "app_debug"})
    public static final class Success extends com.visualdx.codechallenge.network.ApiState {
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<com.visualdx.codechallenge.network.Currency> data = null;
        
        public Success(@org.jetbrains.annotations.NotNull()
        java.util.List<com.visualdx.codechallenge.network.Currency> data) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<com.visualdx.codechallenge.network.Currency> getData() {
            return null;
        }
    }
}