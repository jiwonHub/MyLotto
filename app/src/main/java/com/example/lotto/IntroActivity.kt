package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.Ui.LottoActivity
import com.example.lotto.Ui.LottoViewModel
import com.example.lotto.Ui.PensionActivity
import com.example.lotto.Ui.WebViewActivity
import com.example.lotto.databinding.ActivityIntroBinding


class IntroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityIntroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityIntroBinding.inflate(layoutInflater)
        //로또 버튼 클릭시 LottoActivity로 이동
        binding.buttonLotto.setOnClickListener {
            val intent = Intent(this,LottoActivity::class.java)
            startActivity(intent)
        }
        setContentView(binding.root)
        //연금 복권 버튼 클릭시 pensionActivity로 이동
        binding.buttonPension.setOnClickListener {
            val intent = Intent(this,PensionActivity::class.java)
            startActivity(intent)
        }

        binding.webViewButton.setOnClickListener {
            val intent = Intent(this, WebViewActivity::class.java)
            startActivity(intent)
        }

    }
}