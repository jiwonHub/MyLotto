package com.example.lotto.ui.pension.statistics

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lotto.R
import com.example.lotto.databinding.FragmentPensionStatisticsBinding
import com.example.lotto.ui.lotto.statistics.DashboardViewModel
import com.example.lotto.ui.pension.pension.PensionViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class PensionStatisticsFragment: Fragment(R.layout.fragment_pension_statistics) {

    private lateinit var binding: FragmentPensionStatisticsBinding

    @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentPensionStatisticsBinding.inflate(layoutInflater)

        val pensionStatisticsViewModel = ViewModelProvider(this)[PensionStatisticsViewModel::class.java]

        /*CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val jo : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=win720"
            val doc = Jsoup.connect(url).get()

            *//*jo.add(doc.select("div#article").select("div")[1].select("div").select("div")[1]
                .select("div")[0].select("div").select("div").select("span").select("span").toString())*//*

            for (i in 0..6){
                number.add(doc.select("div#article").select("div")[1].select("div").select("div")[1]
                    .select("div")[0].select("div").select("span")[i].ownText())
            }
            withContext(Dispatchers.Main){
                *//*binding.PastLPensionNumber.text = "$jo + 조"*//*
                binding.BonusPension.text = number.toString()
            }
        }*/

        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
            val doc = Jsoup.connect(url).get()
            for(i in 0..4){
                number.add(doc.select("table#printTarget")[0].select("tbody").select("tr")[i].select("td")[2].ownText())
            }
            withContext(Dispatchers.Main){
                val listAdapter = PensionRecyclerViewAdapter(number)
                binding.recyclerView1.layoutManager = LinearLayoutManager(requireContext(),
                    LinearLayoutManager.VERTICAL,false)
                binding.recyclerView1.adapter = listAdapter
                listAdapter.notifyDataSetChanged()
            }
        }
        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
            val doc = Jsoup.connect(url).get()
            for(i in 0..8){
                number.add(doc.select("table#printTarget")[1].select("tbody").select("tr")[i].select("td")[2].ownText())
            }
            withContext(Dispatchers.Main){
                val listAdapter = PensionRecyclerViewAdapter(number)
                binding.recyclerView2.layoutManager = LinearLayoutManager(requireContext(),
                    LinearLayoutManager.VERTICAL,false)
                binding.recyclerView2.adapter = listAdapter
                listAdapter.notifyDataSetChanged()
            }
        }
        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
            val doc = Jsoup.connect(url).get()
            for(i in 0..8){
                number.add(doc.select("table#printTarget")[2].select("tbody").select("tr")[i].select("td")[2].ownText())
            }
            withContext(Dispatchers.Main){
                val listAdapter = PensionRecyclerViewAdapter(number)
                binding.recyclerView3.layoutManager = LinearLayoutManager(requireContext(),
                    LinearLayoutManager.VERTICAL,false)
                binding.recyclerView3.adapter = listAdapter
                listAdapter.notifyDataSetChanged()
            }
        }
        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
            val doc = Jsoup.connect(url).get()
            for(i in 0..8){
                number.add(doc.select("table#printTarget")[3].select("tbody").select("tr")[i].select("td")[2].ownText())
            }
            withContext(Dispatchers.Main){
                val listAdapter = PensionRecyclerViewAdapter(number)
                binding.recyclerView4.layoutManager = LinearLayoutManager(requireContext(),
                    LinearLayoutManager.VERTICAL,false)
                binding.recyclerView4.adapter = listAdapter
                listAdapter.notifyDataSetChanged()
            }
        }
        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
            val doc = Jsoup.connect(url).get()
            for(i in 0..8){
                number.add(doc.select("table#printTarget")[4].select("tbody").select("tr")[i].select("td")[2].ownText())
            }
            withContext(Dispatchers.Main){
                val listAdapter = PensionRecyclerViewAdapter(number)
                binding.recyclerView5.layoutManager = LinearLayoutManager(requireContext(),
                    LinearLayoutManager.VERTICAL,false)
                binding.recyclerView5.adapter = listAdapter
                listAdapter.notifyDataSetChanged()
            }
        }
        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
            val doc = Jsoup.connect(url).get()
            for(i in 0..8){
                number.add(doc.select("table#printTarget")[5].select("tbody").select("tr")[i].select("td")[2].ownText())
            }
            withContext(Dispatchers.Main){
                val listAdapter = PensionRecyclerViewAdapter(number)
                binding.recyclerView6.layoutManager = LinearLayoutManager(requireContext(),
                    LinearLayoutManager.VERTICAL,false)
                binding.recyclerView6.adapter = listAdapter
                listAdapter.notifyDataSetChanged()
            }
        }
        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=index720"
            val doc = Jsoup.connect(url).get()
            for(i in 0..8){
                number.add(doc.select("table#printTarget")[6].select("tbody").select("tr")[i].select("td")[2].ownText())
            }
            withContext(Dispatchers.Main){
                val listAdapter = PensionRecyclerViewAdapter(number)
                binding.recyclerView7.layoutManager = LinearLayoutManager(requireContext(),
                    LinearLayoutManager.VERTICAL,false)
                binding.recyclerView7.adapter = listAdapter
                listAdapter.notifyDataSetChanged()
            }
        }
        return binding.root
    }
}