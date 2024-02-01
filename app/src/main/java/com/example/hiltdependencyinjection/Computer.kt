package com.example.hiltdependencyinjection

import android.util.Log
import javax.inject.Inject

class Computer @Inject constructor(val ram: Ram,val harDisk: HarDisk) {

    fun getComputer(){
        ram.getRam()
        harDisk.getHarDisk()
        Log.d("main","getComputer")
    }
}

class Ram @Inject constructor() {

    fun getRam(){
        Log.d("main","getRam")
    }
}

class HarDisk @Inject constructor() {

    fun getHarDisk(){
        Log.d("main","getHarDisk")
    }
}