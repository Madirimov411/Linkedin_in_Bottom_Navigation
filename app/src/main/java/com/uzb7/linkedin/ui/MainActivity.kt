package com.uzb7.linkedin.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.uzb7.linkedin.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.linkedinNavGraphFragment) as NavHostFragment
        findViewById<BottomNavigationView>(R.id.bottomNavigationVBiew).setupWithNavController(
            navHostFragment.navController
        )
    }
}