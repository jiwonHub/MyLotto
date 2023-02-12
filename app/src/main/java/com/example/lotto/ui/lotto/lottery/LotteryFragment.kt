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
import kotlinx.android.synthetic.main.fragment_lottery.*

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
        /*lottoViewModel.lottoNumber2.observe(viewLifecycleOwner, Observer {
        })
        lottoViewModel.lottoNumber3.observe(viewLifecycleOwner, Observer {
            binding.lottoNumber3.text = it.toString()
        })
        lottoViewModel.lottoNumber4.observe(viewLifecycleOwner, Observer {
            binding.lottoNumber4.text = it.toString()
        })
        lottoViewModel.lottoNumber5.observe(viewLifecycleOwner, Observer {
            binding.lottoNumber5.text = it.toString()
        })*/

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}