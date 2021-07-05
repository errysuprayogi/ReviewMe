package com.toolslab.reviewme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("LOG", "message "+6)
    }

    fun setting (){
        Log.d("TAG", "This Is Setting log")
    }
}
