package com.example.navigation

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class EndViewModel :ViewModel() {

    private var _data = MutableLiveData<String>()

    val data :LiveData<String>
        get() = _data

    init {
        _data.value="End Fragment"
    }

}