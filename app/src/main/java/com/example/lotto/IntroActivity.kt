package com.example.lotto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.lotto.databinding.ActivityIntroBinding
import com.example.lotto.ui.WebViewActivity
import com.example.lotto.ui.lotto.LottoActivity
import com.example.lotto.ui.pension.PensionActivity


class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //로또 버튼 클릭시 LottoActivity로 이동
        binding.buttonLotto.setOnClickListener {
            val intent = Intent(this, LottoActivity::class.java)
            startActivity(intent)
        }

        //연금 복권 버튼 클릭시 pensionActivity로 이동
        binding.buttonPension.setOnClickListener {
            val intent = Intent(this, PensionActivity::class.java)
            startActivity(intent)
        }

        binding.webViewButton.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }



    }

}

