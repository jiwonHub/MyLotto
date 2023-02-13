package com.example.lotto.ui.lotto.lottery

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.R
import com.example.lotto.databinding.FragmentLotteryBinding

class LotteryFragment : Fragment() {

    private var _binding: FragmentLotteryBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val NumberSet = hashSetOf<Int>()

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
            it?.let {
                binding.lottoNumber1.text = it[0].toString()
                lottoViewModel.setNumberBackGround(it[0], binding.lottoNumber1)
                binding.lottoNumber2.text = it[1].toString()
                lottoViewModel.setNumberBackGround(it[1], binding.lottoNumber2)
                binding.lottoNumber3.text = it[2].toString()
                lottoViewModel.setNumberBackGround(it[2], binding.lottoNumber3)
                binding.lottoNumber4.text = it[3].toString()
                lottoViewModel.setNumberBackGround(it[3], binding.lottoNumber4)
                binding.lottoNumber5.text = it[4].toString()
                lottoViewModel.setNumberBackGround(it[4], binding.lottoNumber5)
                binding.lottoNumber6.text = it[5].toString()
                lottoViewModel.setNumberBackGround(it[5], binding.lottoNumber6)
            }
        })
        lottoViewModel.lottoNumber2.observe(viewLifecycleOwner, Observer {
            it?.let {
                binding.lottoNumber7.text = it[0].toString()
                lottoViewModel.setNumberBackGround(it[0], binding.lottoNumber7)
                binding.lottoNumber8.text = it[1].toString()
                lottoViewModel.setNumberBackGround(it[1], binding.lottoNumber8)
                binding.lottoNumber9.text = it[2].toString()
                lottoViewModel.setNumberBackGround(it[2], binding.lottoNumber9)
                binding.lottoNumber10.text = it[3].toString()
                lottoViewModel.setNumberBackGround(it[3], binding.lottoNumber10)
                binding.lottoNumber11.text = it[4].toString()
                lottoViewModel.setNumberBackGround(it[4], binding.lottoNumber11)
                binding.lottoNumber12.text = it[5].toString()
                lottoViewModel.setNumberBackGround(it[5], binding.lottoNumber12)
            }
        })
        lottoViewModel.lottoNumber3.observe(viewLifecycleOwner, Observer {
            it?.let {
                binding.lottoNumber13.text = it[0].toString()
                lottoViewModel.setNumberBackGround(it[0], binding.lottoNumber13)
                binding.lottoNumber14.text = it[1].toString()
                lottoViewModel.setNumberBackGround(it[1], binding.lottoNumber14)
                binding.lottoNumber15.text = it[2].toString()
                lottoViewModel.setNumberBackGround(it[2], binding.lottoNumber15)
                binding.lottoNumber16.text = it[3].toString()
                lottoViewModel.setNumberBackGround(it[3], binding.lottoNumber16)
                binding.lottoNumber17.text = it[4].toString()
                lottoViewModel.setNumberBackGround(it[4], binding.lottoNumber17)
                binding.lottoNumber18.text = it[5].toString()
                lottoViewModel.setNumberBackGround(it[5], binding.lottoNumber18)
            }
        })
        lottoViewModel.lottoNumber4.observe(viewLifecycleOwner, Observer {
            it?.let {
                binding.lottoNumber19.text = it[0].toString()
                lottoViewModel.setNumberBackGround(it[0], binding.lottoNumber19)
                binding.lottoNumber20.text = it[1].toString()
                lottoViewModel.setNumberBackGround(it[1], binding.lottoNumber20)
                binding.lottoNumber21.text = it[2].toString()
                lottoViewModel.setNumberBackGround(it[2], binding.lottoNumber21)
                binding.lottoNumber22.text = it[3].toString()
                lottoViewModel.setNumberBackGround(it[3], binding.lottoNumber22)
                binding.lottoNumber23.text = it[4].toString()
                lottoViewModel.setNumberBackGround(it[4], binding.lottoNumber23)
                binding.lottoNumber24.text = it[5].toString()
                lottoViewModel.setNumberBackGround(it[5], binding.lottoNumber24)
            }
        })
        lottoViewModel.lottoNumber5.observe(viewLifecycleOwner, Observer {
            it?.let {
                binding.lottoNumber25.text = it[0].toString()
                lottoViewModel.setNumberBackGround(it[0], binding.lottoNumber25)
                binding.lottoNumber26.text = it[1].toString()
                lottoViewModel.setNumberBackGround(it[1], binding.lottoNumber26)
                binding.lottoNumber27.text = it[2].toString()
                lottoViewModel.setNumberBackGround(it[2], binding.lottoNumber27)
                binding.lottoNumber28.text = it[3].toString()
                lottoViewModel.setNumberBackGround(it[3], binding.lottoNumber28)
                binding.lottoNumber29.text = it[4].toString()
                lottoViewModel.setNumberBackGround(it[4], binding.lottoNumber29)
                binding.lottoNumber30.text = it[5].toString()
                lottoViewModel.setNumberBackGround(it[5], binding.lottoNumber30)
            }
        })

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}