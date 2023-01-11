package com.example.lotto.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.lotto.databinding.ActivityLottoBinding
import kotlinx.coroutines.*

class LottoActivity : AppCompatActivity() {
    lateinit var binding: ActivityLottoBinding
    lateinit var randomValue: List<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLottoBinding.inflate(layoutInflater)
        //추첨 번호 클릭시
        binding.start.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                binding.probability.text = counting().toString()
                binding.LottoNumber.text = randomValue.toString()
            }


        }

        setContentView(binding.root)
    }
    //ran() 난수 발생 함수
    private fun ran(): List<Int> {
        val set = mutableSetOf<Int>()
        while(set.size < 6){
            set.add((1..45).random())
        }
        return set.sorted()
    }
    //당첨번호 하나를 난수로 생성하여 그 몇번째 확률로 그 수랑 같아지는지 카운트 출력.
    private fun counting(): Int {
        var cnt = 0
        randomValue = ran()
        while(cnt < 100) {
            val lottoNumber = ran()
            cnt +=1
            if (lottoNumber == randomValue){
                break
            }
        }
        return cnt
    }
}