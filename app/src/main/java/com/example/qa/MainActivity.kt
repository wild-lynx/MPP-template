package com.example.qa

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import spkg.MPclass

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = MPclass()
        a.foo1()
    }
}
