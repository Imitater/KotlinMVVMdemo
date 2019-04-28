package com.example.linwb.childrenstudy

import android.app.Application

class App : Application(){
    init {

    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object {
        lateinit var instance: App

    }
}