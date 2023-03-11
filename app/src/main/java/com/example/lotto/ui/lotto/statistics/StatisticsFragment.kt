package com.example.lotto.ui.lotto.statistics

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
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
            lottoViewModel.setNumberBackGround(it[0].toInt(),binding.pastNum1)
            lottoViewModel.setNumberBackGround(it[1].toInt(),binding.pastNum2)
            lottoViewModel.setNumberBackGround(it[2].toInt(),binding.pastNum3)
            lottoViewModel.setNumberBackGround(it[3].toInt(),binding.pastNum4)
            lottoViewModel.setNumberBackGround(it[4].toInt(),binding.pastNum5)
            lottoViewModel.setNumberBackGround(it[5].toInt(),binding.pastNum6)
            lottoViewModel.setNumberBackGround(it[6].toInt(),binding.pastNum7)
            binding.oper.isVisible = true
        })
        lottoViewModel.num.observe(viewLifecycleOwner) {
            binding.Recycler.adapter = RecycleAdapter(it)
        }

    return binding.root
}

override fun onDestroyView() {
    super.onDestroyView()
    _binding = null
}
}




