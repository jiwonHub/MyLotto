package com.example.lotto.Ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LottoViewModel: ViewModel() {

    private val _currenText = MutableLiveData<List<Int>?>()
    val currenText: LiveData<List<Int>?>
        get() = _currenText

    //TextView 업데이트
    fun updateText(){
        _currenText.value = ran()
    }

}
//난수 발생 함수
private fun ran(): List<Int> {
    val set = mutableSetOf<Int>()
    while(set.size < 6){
        set.add((1..45).random())
    }
    return set.sorted()
}