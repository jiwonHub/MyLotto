package com.example.lotto.ui.lotto.statistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.JsonParser
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.net.URL

class DashboardViewModel : ViewModel() {

    private val _lottoNumber1 = MutableLiveData<String>()
    val lottoNumber1: LiveData<String>
        get() = _lottoNumber1

    fun updateText(){
        CoroutineScope(Dispatchers.IO).launch {
            val pastLottoNumber = getLottoNumbers().slice(0..5).toString().replace('[',' ').replace(']',' ')
            val bonusNumber = getLottoNumbers().last()
            withContext(Dispatchers.Main) {
                _lottoNumber1.value = "$pastLottoNumber+$bonusNumber"
            }
        }
    }


    }
//번호별 통계 가져오기
//private fun getStatistics(): ArrayList<String> {
//    val number : ArrayList<String> = ArrayList()
//    CoroutineScope(Dispatchers.IO).launch {
//        val url = "https://www.dhlottery.co.kr/gameResult.do?method=statByNumber"
//        val doc = Jsoup.connect(url).get()
//        for (i in 0..44) {
//            number.add(
//                doc.select("table#printTarget").select("tbody")
//                    .select("tr")[i].select("td")[2].ownText()
//            )
//        }
//    }
//    return number
//}


//직전회차 로또 당첨 번호 가져오기
private fun getLottoNumbers(): ArrayList<Int> {
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
    val lottoNumbers = ArrayList<Int>()
    try {
        val response = URL(url).readText()
        val jsonObject = JsonParser.parseString(response).asJsonObject

        for (i in 1..6) {
            val lottoNumber = jsonObject.get("drwtNo$i").asInt
            lottoNumbers.add(lottoNumber)
        }
        val bonusNumber = jsonObject.get("bnusNo").asInt
        lottoNumbers.add(bonusNumber)

    }catch (e: Exception){
        e.printStackTrace()
    }
    return lottoNumbers
}




