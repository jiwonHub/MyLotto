package com.example.lotto.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lotto.databinding.ActivityLottoBinding

class LottoActivity : AppCompatActivity() {
    lateinit var binding: ActivityLottoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLottoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun ran() {

    }
}