package com.example.lotto.ui.lotto

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import com.example.lotto.R
import com.example.lotto.databinding.DialogCustomBinding

class DialogCustom(
    context: Context,
) : Dialog(context) { // 뷰를 띄워야하므로 Dialog 클래스는 context를 인자로 받는다.

    private lateinit var binding: DialogCustomBinding
    private var onClickedListener: ButtonClickListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogCustomBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val exceptNumber: ArrayList<Int> = ArrayList()
        // 뒤로가기 버튼, 빈 화면 터치를 통해 dialog가 사라지지 않도록
        setCancelable(false)

        // background를 투명하게 만듦
        // (중요) Dialog는 내부적으로 뒤에 흰 사각형 배경이 존재하므로, 배경을 투명하게 만들지 않으면
        // corner radius의 적용이 보이지 않는다.
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        binding.num1.setOnClickListener {
            exceptNumber.add(1)
            binding.num1.setBackgroundResource(R.drawable.circle_blue)
        }
        binding.savebutton.setOnClickListener {
            onClickedListener?.onClicked(exceptNumber.toString())

            dismiss()
        }
    }

    interface ButtonClickListener {
        fun onClicked(exceptNumber: String)

    }


    fun setOnClickedListener(listner: ButtonClickListener) {
        onClickedListener = listner
    }


}

