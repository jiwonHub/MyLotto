package com.example.lotto.ui.lotto

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import com.example.lotto.R
import com.example.lotto.databinding.DialogCustomBinding

class DialogCustom(
    context: Context,
) {
    private val dialog = Dialog(context)
    private val binding : DialogCustomBinding = DialogCustomBinding.inflate(dialog.layoutInflater)
    private val numarr : MutableList<Int> = mutableListOf()

    fun showDia(){
        dialog.setContentView(binding.root)
        // 뒤로가기 버튼 및 화면 밖 터치시 다이어로그 꺼짐
        dialog.setCancelable(true)
        dialog.setCanceledOnTouchOutside(true)
        // background를 투명하게 만듦
        // (중요) Dialog는 내부적으로 뒤에 흰 사각형 배경이 존재하므로, 배경을 투명하게 만들지 않으면
        // corner radius의 적용이 보이지 않는다.
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        //각 숫자 클릭시 이벤트
        buttonClickEvent()

        binding.savebutton.setOnClickListener {
            onClickListener.onClicked(numarr.toString())
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun buttonClickEvent(){
        binding.num1.setOnClickListener {
            numarr.add(1)
            binding.num1.setBackgroundResource(R.drawable.circle_blue)
        }
        binding.num2.setOnClickListener {
            numarr.add(2)
            binding.num2.setBackgroundResource(R.drawable.circle_blue)
        }
        binding.num3.setOnClickListener {
            numarr.add(3)
            binding.num3.setBackgroundResource(R.drawable.circle_blue)
        }
        binding.num4.setOnClickListener {
            numarr.add(4)
            binding.num4.setBackgroundResource(R.drawable.circle_blue)
        }
        binding.num5.setOnClickListener {
            numarr.add(5)
            binding.num5.setBackgroundResource(R.drawable.circle_blue)
        }
        binding.num6.setOnClickListener {
            numarr.add(6)
            binding.num6.setBackgroundResource(R.drawable.circle_blue)
        }
        binding.num7.setOnClickListener {
            numarr.add(7)
            binding.num7.setBackgroundResource(R.drawable.circle_blue)
        }
    }

    interface ButtonClickListener{
        fun onClicked(text: String)
    }
    private lateinit var onClickListener: ButtonClickListener

    fun setOnClickListener(listener: ButtonClickListener){
        onClickListener = listener
    }
}

