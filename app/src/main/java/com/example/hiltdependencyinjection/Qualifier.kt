package com.example.hiltdependencyinjection

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Inject
import javax.inject.Qualifier

class Test @Inject constructor(
    @FName
    val fName : String,
    @LName
    val lName : String
) {

    fun getNames(){
        Log.d("main","$fName $lName")
    }
}

@Module
@InstallIn(SingletonComponent::class)
object Modules{


    @Provides
    @FName
    fun provideFName() = MainActivity.FName

    @Provides
    @LName
    fun provideLName() = MainActivity.LName

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class FName

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LName