package com.example.lotto.ui.pension.pension

import android.annotation.SuppressLint
import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class PensionViewModel(application: Application) : AndroidViewModel(application) {

    @SuppressLint("StaticFieldLeak")
    private val _lottoNumber1 = MutableLiveData<List<Int>?>()
    val lottoNumber1: LiveData<List<Int>?>
        get() = _lottoNumber1
    private val _lottoNumber2 = MutableLiveData<List<Int>?>()
    val lottoNumber2: LiveData<List<Int>?>
        get() = _lottoNumber2
    private val _lottoNumber3 = MutableLiveData<List<Int>?>()
    val lottoNumber3: LiveData<List<Int>?>
        get() = _lottoNumber3
    private val _lottoNumber4 = MutableLiveData<List<Int>?>()
    val lottoNumber4: LiveData<List<Int>?>
        get() = _lottoNumber4
    private val _lottoNumber5 = MutableLiveData<List<Int>?>()
    val lottoNumber5: LiveData<List<Int>?>
        get() = _lottoNumber5


    //TextView 업데이트
    fun updateText() {
        _lottoNumber1.value = ran()
        _lottoNumber2.value = ran()
        _lottoNumber3.value = ran()
        _lottoNumber4.value = ran()
        _lottoNumber5.value = ran()
    }


}
    //난수 발생 함수
    private fun ran(): List<Int> {
        val lottoNumber = mutableListOf<Int>()
        lottoNumber.add(randomGroup())
        while(lottoNumber.size < 7){
            lottoNumber.add((0..9).random())
        }
        return lottoNumber
    }
//난수 발생 함수
private fun randomGroup(): Int {
    return (1..5).random()
}

