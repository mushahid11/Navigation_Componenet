package com.example.nivigatiom_component

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.findNavController

class MainActivity : AppCompatActivity() {

    lateinit var navControler:NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onSupportNavigateUp(): Boolean {
        navControler = findNavController(R.id.nav_host_fragment_container)
        return navControler.navigateUp() || super.onSupportNavigateUp()
    }
}