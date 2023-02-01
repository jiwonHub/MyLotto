package com.example.lotto.Ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PensionViewModel : ViewModel() {
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
    private val _groupNumber1 = MutableLiveData<Int?>()
    val groupNumber1: LiveData<Int?>
        get() = _groupNumber1
    private val _groupNumber2 = MutableLiveData<Int?>()
    val groupNumber2: LiveData<Int?>
        get() = _groupNumber2
    private val _groupNumber3 = MutableLiveData<Int?>()
    val groupNumber3: LiveData<Int?>
        get() = _groupNumber3
    private val _groupNumber4 = MutableLiveData<Int?>()
    val groupNumber4: LiveData<Int?>
        get() = _groupNumber4
    private val _groupNumber5 = MutableLiveData<Int?>()
    val groupNumber5: LiveData<Int?>
        get() = _groupNumber5


    //TextView 업데이트
    fun updateText() {
        _lottoNumber1.value = ran()
        _lottoNumber2.value = ran()
        _lottoNumber3.value = ran()
        _lottoNumber4.value = ran()
        _lottoNumber5.value = ran()
        _groupNumber1.value = randomGroup()
        _groupNumber2.value = randomGroup()
        _groupNumber3.value = randomGroup()
        _groupNumber4.value = randomGroup()
        _groupNumber5.value = randomGroup()
    }
}
    //난수 발생 함수
    private fun ran(): List<Int> {
        val lottoNumber = mutableListOf<Int>()
        while(lottoNumber.size < 6){
            lottoNumber.add((0..9).random())
        }
        return lottoNumber.sorted()
    }
//난수 발생 함수
private fun randomGroup(): Int {
    return (0..5).random()
}