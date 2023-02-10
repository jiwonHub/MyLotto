package com.example.lotto.ui.lotto.lottery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.FragmentLotteryBinding

class LotteryFragment : Fragment() {

    private var _binding: FragmentLotteryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //뷰모델 연결
        val lottoViewModel =
            ViewModelProvider(this)[HomeViewModel::class.java]

        _binding = FragmentLotteryBinding.inflate(inflater, container, false)
        //추첨 번호 클릭시
        binding.start.setOnClickListener {
            lottoViewModel.updateText()
        }

        lottoViewModel.lottoNumber1.observe(viewLifecycleOwner, Observer {
            binding.lottoNumber1.text = it.toString()
        })
        lottoViewModel.lottoNumber2.observe(viewLifecycleOwner, Observer {
            binding.lottoNumber2.text = it.toString()
        })
        lottoViewModel.lottoNumber3.observe(viewLifecycleOwner, Observer {
            binding.lottoNumber3.text = it.toString()
        })
        lottoViewModel.lottoNumber4.observe(viewLifecycleOwner, Observer {
            binding.lottoNumber4.text = it.toString()
        })
        lottoViewModel.lottoNumber5.observe(viewLifecycleOwner, Observer {
            binding.lottoNumber5.text = it.toString()
        })

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}