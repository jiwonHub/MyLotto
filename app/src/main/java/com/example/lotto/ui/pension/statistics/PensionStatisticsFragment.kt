package com.example.lotto.ui.pension.statistics

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.lotto.databinding.FragmentPensionStatisticsBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.jsoup.Jsoup

class PensionStatisticsFragment: Fragment() {

    private  var _binding: FragmentPensionStatisticsBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPensionStatisticsBinding.inflate(inflater,container,false)

        val pensionStatisticsViewModel = ViewModelProvider(this)[PensionStatisticsViewModel::class.java]

        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val jo : String
            val url = "https://dhlottery.co.kr/gameResult.do?method=win720"
            val doc = Jsoup.connect(url).get()

            jo = (doc.select("div.win_num_wrap")[0].select("div.win720_num").select("div.group").select("span.num.large").select("span")[1].ownText())

            for (i in 1..6){
                number.add(doc.select("div.win_num_wrap")[0].select("div.win720_num").select("span.num.al720_color$i.large").select("span")[1].ownText())
            }
            withContext(Dispatchers.Main){
                binding.PastLPensionNumber.text =  "$jo 조"
                binding.PastLPensionNumber2.text = number.toString()
            }
        }

        CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val url = "https://dhlottery.co.kr/gameResult.do?method=win720"
            val doc = Jsoup.connect(url).get()

            for(i in 1..6){
                number.add(doc.select("div.win_num_wrap")[1].select("div.win720_num").select("span.num.al720_color$i.large").select("span")[1].ownText())
            }

            withContext(Dispatchers.Main){
                binding.BonusNumber.text = number.toString()
            }
        }

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
            for(i in 0..9){
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
            for(i in 0..9){
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
            for(i in 0..9){
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
            for(i in 0..9){
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
            for(i in 0..9){
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
            for(i in 0..9){
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
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}