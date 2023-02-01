package com.example.lotto.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.ActivityPensionBinding

class PensionActivity : AppCompatActivity() {
    lateinit var binding : ActivityPensionBinding
    private lateinit var pensionViewmodel: PensionViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPensionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        //뷰 모델 연결
        pensionViewmodel = ViewModelProvider(this)[PensionViewModel::class.java]

        binding.start.setOnClickListener {
            pensionViewmodel.updateText()
        }
        pensionViewmodel.lottoNumber1.observe(this, Observer {
            binding.lottoNumber1.text = it.toString()
        })
        pensionViewmodel.lottoNumber2.observe(this, Observer {
            binding.lottoNumber2.text = it.toString()
        })
        pensionViewmodel.lottoNumber3.observe(this, Observer {
            binding.lottoNumber3.text = it.toString()
        })
        pensionViewmodel.lottoNumber4.observe(this, Observer {
            binding.lottoNumber4.text = it.toString()
        })
        pensionViewmodel.lottoNumber5.observe(this, Observer {
            binding.lottoNumber5.text = it.toString()
        })
        pensionViewmodel.groupNumber1.observe(this) {
            binding.groupNumber1.text = it.toString() + "조"
        }
        pensionViewmodel.groupNumber2.observe(this) {
            binding.groupNumber2.text = it.toString() + "조"
        }
        pensionViewmodel.groupNumber3.observe(this) {
            binding.groupNumber3.text = it.toString() + "조"
        }
        pensionViewmodel.groupNumber4.observe(this) {
            binding.groupNumber4.text = it.toString() + "조"
        }
        pensionViewmodel.groupNumber5.observe(this) {
            binding.groupNumber5.text = it.toString() + "조"
        }
        setContentView(binding.root)
    }
}