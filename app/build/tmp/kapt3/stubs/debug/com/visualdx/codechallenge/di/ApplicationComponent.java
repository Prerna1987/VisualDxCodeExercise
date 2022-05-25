package com.visualdx.codechallenge.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/visualdx/codechallenge/di/ApplicationComponent;", "", "inject", "", "mainActivity", "Lcom/visualdx/codechallenge/MainActivity;", "homeFragment", "Lcom/visualdx/codechallenge/fragments/HomeFragment;", "app_debug"})
@dagger.Component(modules = {com.visualdx.codechallenge.di.NetworkModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.visualdx.codechallenge.MainActivity mainActivity);
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.visualdx.codechallenge.fragments.HomeFragment homeFragment);
}