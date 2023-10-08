package com.mtoz147.ja5_cryptocrazycompose

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class CryptoCrazyApplication: Application() {
    override fun onCreate() {
        super.onCreate()
    }
}