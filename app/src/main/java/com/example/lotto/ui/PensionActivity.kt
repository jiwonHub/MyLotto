package com.example.lotto.ui

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.ActivityPensionBinding

class PensionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPensionBinding
    private lateinit var pensionViewmodel: PensionViewModel

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityPensionBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

        //뷰 모델 연결
        pensionViewmodel = ViewModelProvider(this)[PensionViewModel::class.java]

        binding.start.setOnClickListener {
            pensionViewmodel.updateText()
        }
        pensionViewmodel.lottoNumber1.observe(this, Observer {
            if (it != null) {
                binding.lottoNumber1.text =
                    it[0].toString() + "조" + it.slice(1..6).toString().replace('[', ' ')
                        .replace(']', ' ')
            }
        })
        pensionViewmodel.lottoNumber2.observe(this, Observer {
            if (it != null) {
                binding.lottoNumber2.text =
                    it[0].toString() + "조" + it.slice(1..6).toString().replace('[', ' ')
                        .replace(']', ' ')
            }
        })
        pensionViewmodel.lottoNumber3.observe(this, Observer {
            if (it != null) {
                binding.lottoNumber3.text =
                    it[0].toString() + "조" + it.slice(1..6).toString().replace('[', ' ')
                        .replace(']', ' ')
            }
        })
        pensionViewmodel.lottoNumber4.observe(this, Observer {
            if (it != null) {
                binding.lottoNumber4.text =
                    it[0].toString() + "조" + it.slice(1..6).toString().replace('[', ' ')
                        .replace(']', ' ')
            }
        })
        pensionViewmodel.lottoNumber5.observe(this, Observer {
            if (it != null) {
                binding.lottoNumber5.text =
                    it[0].toString() + "조" + it.slice(1..6).toString().replace('[', ' ')
                        .replace(']', ' ')
            }
        })

        setContentView(binding.root)
    }
}