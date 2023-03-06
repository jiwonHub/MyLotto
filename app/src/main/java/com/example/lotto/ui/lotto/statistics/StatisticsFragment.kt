package com.example.lotto.ui.lotto.statistics

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.FragmentStatisticsBinding


class StatisticsFragment : Fragment() {

    private var _binding: FragmentStatisticsBinding? = null

    private val binding get() = _binding!!

    @SuppressLint("SetTextI18n", "NotifyDataSetChanged")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentStatisticsBinding.inflate(inflater, container, false)
        //뷰모델 연결
        val lottoViewModel =
            ViewModelProvider(this)[DashboardViewModel::class.java]

        lottoViewModel.updateText()


        lottoViewModel.lottoNumber1.observe(viewLifecycleOwner, Observer {
            binding.PastLottoNumber.text = it
        })
        lottoViewModel.num.observe(viewLifecycleOwner) {
            binding.Recycler.adapter = RecycleAdapter(it)
        }



//        CoroutineScope(Dispatchers.IO).launch {
//            val url = "https://www.dhlottery.co.kr/gameResult.do?method=statByNumber"
//            val doc = Jsoup.connect(url).get()
//            for (i in 0..44) {
//                number.add(
//                    doc.select("table#printTarget").select("tbody")
//                        .select("tr")[i].select("td")[2].ownText()
//                )
//            }
//
//        withContext(Dispatchers.Main) {
//            //리사이클러뷰
//            listAdapter = RecycleAdapter(number)
//            binding.Recycler.adapter = listAdapter
//        }
//    }



    return binding.root
}

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}
}




