package com.example.lotto.ui.pension.statistics

import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lotto.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class PensionStatisticsViewModel(): ViewModel() {
    private val _pensionNumberJo = MutableLiveData<String>()
    val pensionNumberJo: LiveData<String>
        get() = _pensionNumberJo

    private val _pensionNumber = MutableLiveData<ArrayList<String>>()
    val pensionNumber: LiveData<ArrayList<String>>
        get() = _pensionNumber

    private val _pensionBonusNumber = MutableLiveData<ArrayList<String>>()
    val pensionBonusNumber: LiveData<ArrayList<String>>
        get() = _pensionBonusNumber

    private val _pensionRecyclerView1 = MutableLiveData<ArrayList<String>>()
    val pensionRecyclerView1: LiveData<ArrayList<String>>
        get() = _pensionRecyclerView1

    private val _pensionRecyclerView2 = MutableLiveData<ArrayList<String>>()
    val pensionRecyclerView2: LiveData<ArrayList<String>>
        get() = _pensionRecyclerView2

    private val _pensionRecyclerView3 = MutableLiveData<ArrayList<String>>()
    val pensionRecyclerView3: LiveData<ArrayList<String>>
        get() = _pensionRecyclerView3

    private val _pensionRecyclerView4 = MutableLiveData<ArrayList<String>>()
    val pensionRecyclerView4: LiveData<ArrayList<String>>
        get() = _pensionRecyclerView4

    private val _pensionRecyclerView5 = MutableLiveData<ArrayList<String>>()
    val pensionRecyclerView5: LiveData<ArrayList<String>>
        get() = _pensionRecyclerView5

    private val _pensionRecyclerView6 = MutableLiveData<ArrayList<String>>()
    val pensionRecyclerView6: LiveData<ArrayList<String>>
        get() = _pensionRecyclerView6

    private val _pensionRecyclerView7 = MutableLiveData<ArrayList<String>>()
    val pensionRecyclerView7: LiveData<ArrayList<String>>
        get() = _pensionRecyclerView7

    fun updateText(){
        CoroutineScope(Dispatchers.IO).launch {
            val jo = getPensionJo()
            val pensionNumber = getPensionNumber()
            val pensionBonusNumber = getBonusNumber()
            val joNumber = getJoNumber()
            val recyclerView1 = getNumber1()
            val recyclerView2 = getNumber2()
            val recyclerView3 = getNumber3()
            val recyclerView4 = getNumber4()
            val recyclerView5 = getNumber5()
            val recyclerView6 = getNumber6()
            withContext(Dispatchers.Main){
                _pensionNumberJo.value = jo
                _pensionNumber.value = pensionNumber
                _pensionBonusNumber.value = pensionBonusNumber
                _pensionRecyclerView1.value = joNumber
                _pensionRecyclerView2.value = recyclerView1
                _pensionRecyclerView3.value = recyclerView2
                _pensionRecyclerView4.value = recyclerView3
                _pensionRecyclerView5.value = recyclerView4
                _pensionRecyclerView6.value = recyclerView5
                _pensionRecyclerView7.value = recyclerView6
            }
        }
    }

    fun setNumberBackGround(number: Int, textView: TextView, i: Int){
        when(i){ // 숫자별로 색깔 꾸미기
            0 -> textView.setBackgroundResource(R.drawable.circle_jo)
            1 -> textView.setBackgroundResource(R.drawable.circle_red)
            2 -> textView.setBackgroundResource(R.drawable.circle_orange)
            3 -> textView.setBackgroundResource(R.drawable.circle_yello)
            4 -> textView.setBackgroundResource(R.drawable.circle_blue)
            5 -> textView.setBackgroundResource(R.drawable.circle_purple)
            6 -> textView.setBackgroundResource(R.drawable.circle_gray)
        }
        textView.text = number.toString()
    }
}

private fun getPensionJo(): String {
    val jo : String
    val url = "https://dhlottery.co.kr/gameResult.do?method=win720"
    val doc = Jsoup.connect(url).get()

    jo = (doc.select("div.win_num_wrap")[0].select("div.win720_num").select("div.group").select("span.num.large").select("span")[1].ownText())
    return jo
}

private fun getPensionNumber(): ArrayList<String> {
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=win720"
    val doc = Jsoup.connect(url).get()
    for (i in 1..6){
        number.add(doc.select("div.win_num_wrap")[0].select("div.win720_num").select("span.num.al720_color$i.large").select("span")[1].ownText())
    }
    return number
}

private fun getBonusNumber(): ArrayList<String>{
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=win720"
    val doc = Jsoup.connect(url).get()

    for(i in 1..6){
        number.add(doc.select("div.win_num_wrap")[1].select("div.win720_num").select("span.num.al720_color$i.large").select("span")[1].ownText())
    }

    return number
}

private fun getJoNumber(): ArrayList<String>{
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
    val doc = Jsoup.connect(url).get()
    for(i in 0..4){
        number.add(doc.select("table#printTarget")[0].select("tbody").select("tr")[i].select("td")[2].ownText())
    }
    return number
}

private fun getNumber1(): ArrayList<String>{
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
    val doc = Jsoup.connect(url).get()
    for(i in 0..9){
        number.add(doc.select("table#printTarget")[1].select("tbody").select("tr")[i].select("td")[2].ownText())
    }
    return number
}

private fun getNumber2(): ArrayList<String>{
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
    val doc = Jsoup.connect(url).get()
    for(i in 0..9){
        number.add(doc.select("table#printTarget")[2].select("tbody").select("tr")[i].select("td")[2].ownText())
    }
    return number
}

private fun getNumber3(): ArrayList<String>{
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
    val doc = Jsoup.connect(url).get()
    for(i in 0..9){
        number.add(doc.select("table#printTarget")[3].select("tbody").select("tr")[i].select("td")[2].ownText())
    }
    return number
}

private fun getNumber4(): ArrayList<String>{
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
    val doc = Jsoup.connect(url).get()
    for(i in 0..9){
        number.add(doc.select("table#printTarget")[4].select("tbody").select("tr")[i].select("td")[2].ownText())
    }
    return number
}

private fun getNumber5(): ArrayList<String>{
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
    val doc = Jsoup.connect(url).get()
    for(i in 0..9){
        number.add(doc.select("table#printTarget")[5].select("tbody").select("tr")[i].select("td")[2].ownText())
    }
    return number
}
private fun getNumber6(): ArrayList<String>{
    val number : ArrayList<String> = arrayListOf()
    val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
    val doc = Jsoup.connect(url).get()
    for(i in 0..9){
        number.add(doc.select("table#printTarget")[6].select("tbody").select("tr")[i].select("td")[2].ownText())
    }
    return number
}