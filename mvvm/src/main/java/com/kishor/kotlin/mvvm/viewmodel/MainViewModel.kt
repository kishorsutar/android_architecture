package com.kishor.kotlin.mvvm.viewmodel

import androidx.lifecycle.ViewModel

class MainViewModel(val displayString: String = "MVVM") : ViewModel() {

    fun displayCounter(): String {
        return "0"
    }
}
