package com.example.hiltdependencyinjection

import android.util.Log

class Car constructor(private val engine: Engine,private  val wheel: Wheel){
    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.d("main","Car is Running")
    }
}

class Engine {
    fun getEngine(){
        Log.d("main","Engine is Start")
    }
}

class Wheel {
    fun getWheel(){
        Log.d("main","Wheel is Moving")
    }
}