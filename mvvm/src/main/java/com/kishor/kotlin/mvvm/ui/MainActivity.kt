package com.kishor.kotlin.mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.kishor.kotlin.mvvm.R
import com.kishor.kotlin.mvvm.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private val viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
