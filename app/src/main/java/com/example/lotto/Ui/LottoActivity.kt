package com.example.lotto.Ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.lotto.databinding.ActivityLottoBinding
import kotlinx.coroutines.*
import java.util.stream.Collectors.counting

class LottoActivity : AppCompatActivity() {
    lateinit var binding: ActivityLottoBinding
    lateinit var randomValue: List<Int>
    private lateinit var lottoViewModel: LottoViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLottoBinding.inflate(layoutInflater)
        //추첨 번호 클릭시
        binding.start.setOnClickListener {
            lottoViewModel.updateText()
            //코루틴 실행 Ui 스레드 사용
//            CoroutineScope(Dispatchers.Main).launch {
////                binding.probability.text = counting().toString()
//                binding.LottoNumber.text = randomValue.toString()
//            }


        }
        //뷰모델 연결
        lottoViewModel = ViewModelProvider(this)[LottoViewModel::class.java]
        lottoViewModel.currenText.observe(this, Observer {
            binding.LottoNumber.text = it.toString()
        })

        setContentView(binding.root)
    }

//    //당첨번호 하나를 난수로 생성하여 그 몇번째 확률로 그 수랑 같아지는지 카운트 출력.
//    private fun counting(): Int {
//        var cnt = 0
//        randomValue = ran()
//        while(cnt < 100) {
//            val lottoNumber = ran()
//            cnt +=1
//            if (lottoNumber == randomValue){
//                break
//            }
//        }
//        return cnt
//    }
}