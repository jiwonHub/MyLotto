package com.example.lotto.ui.pension.statistics

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.FragmentPensionStatisticsBinding

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

        pensionStatisticsViewModel.updateText()



        pensionStatisticsViewModel.pensionNumberJo.observe(viewLifecycleOwner){
            pensionStatisticsViewModel.setNumberBackGround(it.toInt(), binding.PastLPensionNumber,0)
            binding.jo.isVisible = true
        }
        pensionStatisticsViewModel.pensionNumber.observe(viewLifecycleOwner, Observer{
            pensionStatisticsViewModel.setNumberBackGround(it[0].toInt(),binding.PastLPensionNumber2,1)
            pensionStatisticsViewModel.setNumberBackGround(it[1].toInt(),binding.PastLPensionNumber3,2)
            pensionStatisticsViewModel.setNumberBackGround(it[2].toInt(),binding.PastLPensionNumber4,3)
            pensionStatisticsViewModel.setNumberBackGround(it[3].toInt(),binding.PastLPensionNumber5,4)
            pensionStatisticsViewModel.setNumberBackGround(it[4].toInt(),binding.PastLPensionNumber6,5)
            pensionStatisticsViewModel.setNumberBackGround(it[5].toInt(),binding.PastLPensionNumber7,6)
        })

        pensionStatisticsViewModel.pensionBonusNumber.observe(viewLifecycleOwner, Observer{
            pensionStatisticsViewModel.setNumberBackGround(it[0].toInt(),binding.BonusNumber1,1)
            pensionStatisticsViewModel.setNumberBackGround(it[1].toInt(),binding.BonusNumber2,2)
            pensionStatisticsViewModel.setNumberBackGround(it[2].toInt(),binding.BonusNumber3,3)
            pensionStatisticsViewModel.setNumberBackGround(it[3].toInt(),binding.BonusNumber4,4)
            pensionStatisticsViewModel.setNumberBackGround(it[4].toInt(),binding.BonusNumber5,5)
            pensionStatisticsViewModel.setNumberBackGround(it[5].toInt(),binding.BonusNumber6,6)
            binding.bonusTextView.isVisible = true
        })

        pensionStatisticsViewModel.pensionRecyclerView1.observe(viewLifecycleOwner){
            binding.recyclerView1.adapter = PensionRecyclerViewAdapter(it,0)
        }
        pensionStatisticsViewModel.pensionRecyclerView2.observe(viewLifecycleOwner){
            binding.recyclerView2.adapter = PensionRecyclerViewAdapter(it,1)
        }
        pensionStatisticsViewModel.pensionRecyclerView3.observe(viewLifecycleOwner){
            binding.recyclerView3.adapter = PensionRecyclerViewAdapter(it,2)
        }
        pensionStatisticsViewModel.pensionRecyclerView4.observe(viewLifecycleOwner){
            binding.recyclerView4.adapter = PensionRecyclerViewAdapter(it,3)
        }
        pensionStatisticsViewModel.pensionRecyclerView5.observe(viewLifecycleOwner){
            binding.recyclerView5.adapter = PensionRecyclerViewAdapter(it,4)
        }
        pensionStatisticsViewModel.pensionRecyclerView6.observe(viewLifecycleOwner){
            binding.recyclerView6.adapter = PensionRecyclerViewAdapter(it,5)
        }
        pensionStatisticsViewModel.pensionRecyclerView7.observe(viewLifecycleOwner){
            binding.recyclerView7.adapter = PensionRecyclerViewAdapter(it,6)
        }

        /*CoroutineScope(Dispatchers.IO).launch {
            val number : MutableList<String> = mutableListOf()
            val jo : String
            val url = "https://dhlottery.co.kr/gameResult.do?method=win720"
            val doc = Jsoup.connect(url).get()

            jo = (doc.select("div.win_num_wrap")[0].select("div.win720_num").select("div.group").select("span.num.large").select("span")[1].ownText())

            for (i in 1..6){
                number.add(doc.select("div.win_num_wrap")[0].select("div.win720_num").select("span.num.al720_color$i.large").select("span")[1].ownText())
            }
            withContext(Dispatchers.Main){
                binding.PastLPensionNumber.text = jo
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
        }

        CoroutineScope(Dispatchers.IO).launch {
            val number : ArrayList<String> = arrayListOf()
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
            val number : ArrayList<String> = arrayListOf()
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
            val number : ArrayList<String> = arrayListOf()
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
            val number : ArrayList<String> = arrayListOf()
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
            val number : ArrayList<String> = arrayListOf()
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
            val number : ArrayList<String> = arrayListOf()
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
            val number : ArrayList<String> = arrayListOf()
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
        }*/
        return binding.root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}