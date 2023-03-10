package com.example.lotto.ui.lotto.lottery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
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

        //제외 수 버튼 클릭
        binding.delNum.setOnClickListener {
            lottoViewModel.dialogShowExcept(requireContext())
        }
        // 고정 수 버튼 클릭
        binding.fixNum.setOnClickListener {
            lottoViewModel.dialogShowFix(requireContext())
        }

        //추첨 번호 클릭시
        binding.start.setOnClickListener {
            lottoViewModel.updateText()
        }
        //제외수
        lottoViewModel.exceptNumber.observe(viewLifecycleOwner) {
            binding.exnum0.isVisible = false
            binding.exnum1.isVisible = false
            binding.exnum2.isVisible = false
            binding.exnum3.isVisible = false
            binding.exnum4.isVisible = false
            if (it != null) {
                when (it.size) {
                    1 -> lottoViewModel.setExcepNumberBackGround(it[0], binding.exnum0)
                    2 -> {
                        lottoViewModel.setExcepNumberBackGround(it[0], binding.exnum0)
                        lottoViewModel.setExcepNumberBackGround(it[1], binding.exnum1)
                    }
                    3 -> {
                        lottoViewModel.setExcepNumberBackGround(it[0], binding.exnum0)
                        lottoViewModel.setExcepNumberBackGround(it[1], binding.exnum1)
                        lottoViewModel.setExcepNumberBackGround(it[2], binding.exnum2)
                    }
                    4 -> {
                        lottoViewModel.setExcepNumberBackGround(it[0], binding.exnum0)
                        lottoViewModel.setExcepNumberBackGround(it[1], binding.exnum1)
                        lottoViewModel.setExcepNumberBackGround(it[2], binding.exnum2)
                        lottoViewModel.setExcepNumberBackGround(it[3], binding.exnum3)
                    }
                    5 -> {
                        lottoViewModel.setExcepNumberBackGround(it[0], binding.exnum0)
                        lottoViewModel.setExcepNumberBackGround(it[1], binding.exnum1)
                        lottoViewModel.setExcepNumberBackGround(it[2], binding.exnum2)
                        lottoViewModel.setExcepNumberBackGround(it[3], binding.exnum3)
                        lottoViewModel.setExcepNumberBackGround(it[4], binding.exnum4)
                    }
                }
            }

        }

        //고정수
        lottoViewModel.fixNumber.observe(viewLifecycleOwner) {
            binding.fixNum0.isVisible = false
            binding.fixNum1.isVisible = false
            binding.fixNum2.isVisible = false
            binding.fixNum3.isVisible = false
            binding.fixNum4.isVisible = false
            if (it != null) {
                when (it.size) {
                    1 -> lottoViewModel.setFixNumberBackGround(it[0], binding.fixNum0)
                    2 -> {
                        lottoViewModel.setFixNumberBackGround(it[0], binding.fixNum0)
                        lottoViewModel.setFixNumberBackGround(it[1], binding.fixNum1)
                    }
                    3 -> {
                        lottoViewModel.setFixNumberBackGround(it[0], binding.fixNum0)
                        lottoViewModel.setFixNumberBackGround(it[1], binding.fixNum1)
                        lottoViewModel.setFixNumberBackGround(it[2], binding.fixNum2)
                    }
                    4 -> {
                        lottoViewModel.setFixNumberBackGround(it[0], binding.fixNum0)
                        lottoViewModel.setFixNumberBackGround(it[1], binding.fixNum1)
                        lottoViewModel.setFixNumberBackGround(it[2], binding.fixNum2)
                        lottoViewModel.setFixNumberBackGround(it[3], binding.fixNum3)
                    }
                    5 -> {
                        lottoViewModel.setFixNumberBackGround(it[0], binding.fixNum0)
                        lottoViewModel.setFixNumberBackGround(it[1], binding.fixNum1)
                        lottoViewModel.setFixNumberBackGround(it[2], binding.fixNum2)
                        lottoViewModel.setFixNumberBackGround(it[3], binding.fixNum3)
                        lottoViewModel.setFixNumberBackGround(it[4], binding.fixNum4)
                    }
                }
            }
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