package com.example.mvvm

import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import android.os.Bundle
import com.example.mvvm.databinding.ActivityMainBinding
import com.example.mvvm.viewmodels.VMMain

class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewmodel = VMMain(application)

        binding.viewmodel!!.apicall()

    }
}
