package com.example.wtech_mvvm_example.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.wtech_mvvm_example.R
import com.example.wtech_mvvm_example.databinding.ActivityAnaBinding


class AnaActivity : AppCompatActivity(){

    private lateinit var binding: ActivityAnaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_ana)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerViewAna) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navHostFragment.navController)
    }

}