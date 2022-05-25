package com.visualdx.codechallenge.di

import com.visualdx.codechallenge.MainActivity
import com.visualdx.codechallenge.fragments.HomeFragment
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)
    fun inject(homeFragment: HomeFragment)
}