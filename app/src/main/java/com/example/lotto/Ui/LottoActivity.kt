package com.example.lotto.Ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.ActivityLottoBinding
import kotlinx.coroutines.*

class LottoActivity : AppCompatActivity() {
    lateinit var binding: ActivityLottoBinding
    private lateinit var lottoViewModel: LottoViewModel
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLottoBinding.inflate(layoutInflater)
        //추첨 번호 클릭시
        binding.start.setOnClickListener {
            lottoViewModel.updateText()
        }
        //뷰모델 연결
        lottoViewModel = ViewModelProvider(this)[LottoViewModel::class.java]
        lottoViewModel.lottoNumber1.observe(this, Observer {
            binding.lottoNumber1.text = it.toString()
        })
        lottoViewModel.lottoNumber2.observe(this, Observer {
            binding.lottoNumber2.text = it.toString()
        })
        lottoViewModel.lottoNumber3.observe(this, Observer {
            binding.lottoNumber3.text = it.toString()
        })
        lottoViewModel.lottoNumber4.observe(this, Observer {
            binding.lottoNumber4.text = it.toString()
        })
        lottoViewModel.lottoNumber5.observe(this, Observer {
            binding.lottoNumber5.text = it.toString()
        })

        setContentView(binding.root)
    }

}