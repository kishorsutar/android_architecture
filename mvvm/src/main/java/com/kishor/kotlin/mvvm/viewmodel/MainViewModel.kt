package com.kishor.kotlin.mvvm.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel

class MainViewModel(application: Application, val displayString: String = "MVVM") : AndroidViewModel(application)
