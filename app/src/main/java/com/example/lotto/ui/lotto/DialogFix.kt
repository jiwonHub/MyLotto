package com.example.lotto.ui.lotto

import android.app.Dialog
import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.widget.Toast
import com.example.lotto.R
import com.example.lotto.databinding.DialogCustomBinding

class DialogFix(
    private val context: Context,
) {
    private val dialog = Dialog(context)
    private val binding : DialogCustomBinding = DialogCustomBinding.inflate(dialog.layoutInflater)
    private val pickNumberSet = hashSetOf<Int>()

    fun showDia(){
        dialog.setContentView(binding.root)
        dialog.setCancelable(true)
        dialog.setCanceledOnTouchOutside(true)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

        buttonClickEvent()

        binding.savebutton.setOnClickListener {
            onClickListener.onClicked(pickNumberSet.toString())
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun buttonClickEvent(){
        binding.num1.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
            }
            if (pickNumberSet.contains(1)){
                pickNumberSet.remove(1)
                binding.num1.setBackgroundResource(R.drawable.button_custom)
            }else{
                pickNumberSet.add(1)
                binding.num1.setBackgroundResource(R.drawable.circle_blue)
            }
        }
        binding.num2.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
            }
            if (pickNumberSet.contains(2)){
                pickNumberSet.remove(2)
                binding.num2.setBackgroundResource(R.drawable.button_custom)
            }else{
                pickNumberSet.add(2)
                binding.num2.setBackgroundResource(R.drawable.circle_blue)
            }
        }
        binding.num3.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
            }
            if (pickNumberSet.contains(3)){
                pickNumberSet.remove(3)
                binding.num3.setBackgroundResource(R.drawable.button_custom)
            }else{
                pickNumberSet.add(3)
                binding.num3.setBackgroundResource(R.drawable.circle_blue)
            }
        }
        binding.num4.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
            }
            if (pickNumberSet.contains(4)){
                pickNumberSet.remove(4)
                binding.num4.setBackgroundResource(R.drawable.button_custom)
            }else{
                pickNumberSet.add(4)
                binding.num4.setBackgroundResource(R.drawable.circle_blue)
            }
        }
        binding.num5.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
            }
            if (pickNumberSet.contains(5)){
                pickNumberSet.remove(5)
                binding.num5.setBackgroundResource(R.drawable.button_custom)
            }else{
                pickNumberSet.add(5)
                binding.num5.setBackgroundResource(R.drawable.circle_blue)
            }
        }
        binding.num6.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
            }
            if (pickNumberSet.contains(6)){
                pickNumberSet.remove(6)
                binding.num6.setBackgroundResource(R.drawable.button_custom)
            }else{
                pickNumberSet.add(6)
                binding.num6.setBackgroundResource(R.drawable.circle_blue)
            }
        }
        binding.num7.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
            }
            if (pickNumberSet.contains(7)){
                pickNumberSet.remove(7)
                binding.num7.setBackgroundResource(R.drawable.button_custom)
            }else{
                pickNumberSet.add(7)
                binding.num7.setBackgroundResource(R.drawable.circle_blue)
            }
        }
    }

    interface ButtonClickListener{
        fun onClicked(text: String)
    }
    private lateinit var onClickListener: ButtonClickListener

    fun setOnClickListener(listener: ButtonClickListener){
        onClickListener = listener
    }

    fun setPickNumber(): HashSet<Int> {
        return pickNumberSet
    }
}