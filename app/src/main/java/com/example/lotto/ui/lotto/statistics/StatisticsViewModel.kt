package com.example.lotto.ui.lotto.statistics

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lotto.R
import com.google.gson.JsonParser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup
import java.net.URL

class DashboardViewModel : ViewModel() {

    private val _lottoNumber1 = MutableLiveData<List<String>>()
    val lottoNumber1: LiveData<List<String>>
        get() = _lottoNumber1
    private val _num = MutableLiveData<ArrayList<String>>()
    val num: LiveData<ArrayList<String>>
        get() = _num

    fun updateText(){
        CoroutineScope(Dispatchers.IO).launch {
            val pastLottoNumber = getLottoNumbers()
            val number = getStatistics()
            withContext(Dispatchers.Main) {
                _lottoNumber1.value = pastLottoNumber
                _num.value = number
            }
        }
    }
     fun setNumberBackGround(number: Int, textView: TextView){
        when(number){ // 숫자별로 색깔 꾸미기
            in 1..10 -> textView.setBackgroundResource(R.drawable.circle_yello)
            in 11..20 -> textView.setBackgroundResource(R.drawable.circle_blue)
            in 21..30 -> textView.setBackgroundResource(R.drawable.circle_red)
            in 31..40 -> textView.setBackgroundResource(R.drawable.circle_gray)
            in 41..50 -> textView.setBackgroundResource(R.drawable.circle_green)
        }
        textView.text = number.toString()
    }

}
//번호별 통계 가져오기
private fun getStatistics(): ArrayList<String> {
    val number : ArrayList<String> = ArrayList()

        val url = "https://www.dhlottery.co.kr/gameResult.do?method=statByNumber"
        val doc = Jsoup.connect(url).get()
        for (i in 0..44) {
            number.add(
                doc.select("table#printTarget").select("tbody")
                    .select("tr")[i].select("td")[2].ownText()
            )
        }
    return number
}


//직전회차 로또 당첨 번호 가져오기
private fun getLottoNumbers(): ArrayList<String> {
    var round = 1054
    while (true){

        val url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=${round.toString()}"
        try {
            val response = URL(url).readText()
            val jsonObject = JsonParser.parseString(response).asJsonObject
            val returnValue = jsonObject.get("returnValue").asString
            //직전회차까지 round를 증가시켜 확인.
            if (returnValue == "fail") {
                round -=1
                break
            }else{
                round +=1
            }
        }catch (e:Exception){
            e.printStackTrace()
        }
    }
    val url = "https://www.dhlottery.co.kr/common.do?method=getLottoNumber&drwNo=$round"
    val lottoNumbers = ArrayList<String>()
    try {
        val response = URL(url).readText()
        val jsonObject = JsonParser.parseString(response).asJsonObject

        for (i in 1..6) {
            val lottoNumber = jsonObject.get("drwtNo$i").asString
            lottoNumbers.add(lottoNumber)
        }
        val bonusNumber = jsonObject.get("bnusNo").asString
        lottoNumbers.add(bonusNumber)

    }catch (e: Exception){
        e.printStackTrace()
    }
    return lottoNumbers
}




