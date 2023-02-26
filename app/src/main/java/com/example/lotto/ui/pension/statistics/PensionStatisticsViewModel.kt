package com.example.lotto.ui.pension.statistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PensionStatisticsViewModel(): ViewModel() {
    private val _lottoNumber1 = MutableLiveData<String>()
    val lottoNumber1: LiveData<String>
        get() = _lottoNumber1


}