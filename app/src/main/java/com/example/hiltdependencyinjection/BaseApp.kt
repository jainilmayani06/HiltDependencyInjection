package com.example.hiltdependencyinjection

import android.app.Application
import com.example.hiltdependencyinjection.interfaces.AppModule
import com.example.hiltdependencyinjection.interfaces.Main
import dagger.hilt.android.HiltAndroidApp

//Container class where we Store or Put all dependency
@HiltAndroidApp
class BaseApp : Application() {

    var car = Car(Engine(), Wheel())

    val main = AppModule.main
}