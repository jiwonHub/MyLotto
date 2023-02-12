package com.example.lotto.ui.lotto.lottery

import android.annotation.SuppressLint
import android.app.Application
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lotto.R

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    @SuppressLint("StaticFieldLeak")
    private val context = getApplication<Application>().applicationContext

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
    fun updateText(){
        _lottoNumber1.value = ran()
       /* _lottoNumber2.value = ran()
        _lottoNumber3.value = ran()
        _lottoNumber4.value = ran()
        _lottoNumber5.value = ran()*/
    }

    @SuppressLint("UseRequireInsteadOfGet")
    fun setNumberBackGround(number: Int, textView: TextView){
        when(number){ // 숫자별로 색깔 꾸미기
            in 1..10 -> textView.background = ContextCompat.getDrawable(context, R.drawable.circle_yello)
            in 11..20 -> textView.background = ContextCompat.getDrawable(context, R.drawable.circle_blue)
            in 21..30 -> textView.background = ContextCompat.getDrawable(context, R.drawable.circle_red)
            in 31..40 -> textView.background = ContextCompat.getDrawable(context, R.drawable.circle_gray)
            in 41..50 -> textView.background = ContextCompat.getDrawable(context, R.drawable.circle_green)
        }

        textView.isVisible = true
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

