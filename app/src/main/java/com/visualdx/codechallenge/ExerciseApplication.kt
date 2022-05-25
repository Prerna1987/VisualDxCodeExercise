package com.visualdx.codechallenge

import android.app.Application
import com.visualdx.codechallenge.di.ApplicationComponent
import com.visualdx.codechallenge.di.DaggerApplicationComponent

class ExerciseApplication: Application() {

    lateinit var applicationComponent: ApplicationComponent

    override fun onCreate() {
        super.onCreate()

        applicationComponent = DaggerApplicationComponent.builder().build()
    }
}