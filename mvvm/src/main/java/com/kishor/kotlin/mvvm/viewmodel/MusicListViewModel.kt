package com.kishor.kotlin.mvvm.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class MusicListViewModel(val displayString: String = "MVVM") : ViewModel() {

    init {
//        Log.i("MusicListViewModel", "created")
    }


    override fun onCleared() {
        super.onCleared()
        Log.i("MusicListViewModel", "Cleared")
    }
}

