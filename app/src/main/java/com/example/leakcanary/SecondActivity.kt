package com.example.leakcanary

import android.os.Bundle
import androidx.activity.ComponentActivity

class SecondActivity: ComponentActivity(){

        override fun onCreate(savedInstanceState: Bundle?){
            super.onCreate(savedInstanceState)
            MainActivity.context = this
        }
}