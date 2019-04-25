package com.example.navigation

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    /*
    override fun onSupportNavigateUp()=
        Navigation.findNavController(this,R.id.navigation_host).navigateUp()

        */
}
