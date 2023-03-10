package com.example.lotto.ui.lotto

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.TextView
import android.widget.Toast
import com.example.lotto.R
import com.example.lotto.databinding.DialogCustomBinding

class DialogExcept(
    private val context: Context,
) {
    private val dialog = Dialog(context)
    private val binding : DialogCustomBinding = DialogCustomBinding.inflate(dialog.layoutInflater)
    private var pickNumberSet = mutableListOf<Int>()

    private var click : Boolean = true

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
            onClickListener.onClicked(pickNumberSet)
            dialog.dismiss()
        }

        dialog.show()
    }
    private fun setNumber(textView: TextView , number : Int){
        textView.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "제외수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(number)) {
                    pickNumberSet.remove(number)
                    textView.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(number)){
                    pickNumberSet.remove(number)
                    textView.setBackgroundResource(R.drawable.button_custom)
                }else {
                    pickNumberSet.add(number)
                    textView.setBackgroundResource(R.drawable.circle_deepred)
                }
            }
        }

    }
    private fun buttonClickEvent(){
        setNumber(binding.num1,1)
        setNumber(binding.num2,2)
        setNumber(binding.num3,3)
        setNumber(binding.num4,4)
        setNumber(binding.num5,5)
        setNumber(binding.num6,6)
        setNumber(binding.num7,7)
        setNumber(binding.num8,8)
        setNumber(binding.num9,9)
        setNumber(binding.num10,10)
        setNumber(binding.num11,11)
        setNumber(binding.num12,12)
        setNumber(binding.num13,13)
        setNumber(binding.num14,14)
        setNumber(binding.num15,15)
        setNumber(binding.num16,16)
        setNumber(binding.num17,17)
        setNumber(binding.num18,18)
        setNumber(binding.num19,19)
        setNumber(binding.num20,20)
        setNumber(binding.num21,21)
        setNumber(binding.num22,22)
        setNumber(binding.num23,23)
        setNumber(binding.num24,24)
        setNumber(binding.num25,25)
        setNumber(binding.num26,26)
        setNumber(binding.num27,27)
        setNumber(binding.num28,28)
        setNumber(binding.num29,29)
        setNumber(binding.num30,30)
        setNumber(binding.num31,31)
        setNumber(binding.num32,32)
        setNumber(binding.num33,33)
        setNumber(binding.num34,34)
        setNumber(binding.num35,35)
        setNumber(binding.num36,36)
        setNumber(binding.num37,37)
        setNumber(binding.num38,38)
        setNumber(binding.num39,39)
        setNumber(binding.num40,40)
        setNumber(binding.num41,41)
        setNumber(binding.num42,42)
        setNumber(binding.num43,43)
        setNumber(binding.num44,44)
        setNumber(binding.num45,45)



    }

    interface ButtonClickListener{
        fun onClicked(text: MutableList<Int>)
    }
    private lateinit var onClickListener: ButtonClickListener

    fun setOnClickListener(listener: ButtonClickListener){
        onClickListener = listener
    }

}

