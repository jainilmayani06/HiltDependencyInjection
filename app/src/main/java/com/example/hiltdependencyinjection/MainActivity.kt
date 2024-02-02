package com.example.hiltdependencyinjection

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.hiltdependencyinjection.interfaces.MainOne
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

@Inject
lateinit var computer: Computer

@Inject
lateinit var main: MainOne

@Inject
lateinit var test: Test

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        computer.getComputer()
        main.demOne()

        test.getNames()

    }
    companion object{
        val FName = "Jainil"
        val LName = "Mayani"
    }
}
