package com.sopt.now.compose

import android.app.Application
import androidx.appcompat.app.AppCompatDelegate
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        initTimber()
        setDayMode()
    }

    private fun initTimber() {
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
    }

    private fun setDayMode() {
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
    }

}
