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
            onClickListener.onClicked(pickNumberSet)
            dialog.dismiss()
        }

        dialog.show()
    }

    private fun buttonClickEvent(){
        binding.num1.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(1)) {
                    pickNumberSet.remove(1)
                    binding.num1.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(1)){
                    pickNumberSet.remove(1)
                    binding.num1.setBackgroundResource(R.drawable.button_custom)
                }else {
                    pickNumberSet.add(1)
                    binding.num1.setBackgroundResource(R.drawable.circle_blue)
                }
            }
        }
        binding.num2.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(2)) {
                    pickNumberSet.remove(2)
                    binding.num2.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(2)){
                    pickNumberSet.remove(2)
                    binding.num2.setBackgroundResource(R.drawable.button_custom)
                }else {
                    pickNumberSet.add(2)
                    binding.num2.setBackgroundResource(R.drawable.circle_blue)
                }
            }
        }
        binding.num3.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(3)) {
                    pickNumberSet.remove(3)
                    binding.num3.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else {
                if (pickNumberSet.contains(3)){
                    pickNumberSet.remove(3)
                    binding.num3.setBackgroundResource(R.drawable.button_custom)
                }else {
                    pickNumberSet.add(3)
                    binding.num3.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num4.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(4)) {
                    pickNumberSet.remove(4)
                    binding.num4.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(4)){
                    pickNumberSet.remove(4)
                    binding.num4.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(4)
                    binding.num4.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num5.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(5)) {
                    pickNumberSet.remove(5)
                    binding.num5.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(5)){
                    pickNumberSet.remove(5)
                    binding.num5.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(5)
                    binding.num5.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num6.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(6)) {
                    pickNumberSet.remove(6)
                    binding.num6.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(6)){
                    pickNumberSet.remove(6)
                    binding.num6.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(6)
                    binding.num6.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num7.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(7)) {
                    pickNumberSet.remove(7)
                    binding.num7.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(7)){
                    pickNumberSet.remove(7)
                    binding.num7.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(7)
                    binding.num7.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num8.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(8)) {
                    pickNumberSet.remove(8)
                    binding.num8.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(8)){
                    pickNumberSet.remove(8)
                    binding.num8.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(8)
                    binding.num8.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num9.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(9)) {
                    pickNumberSet.remove(9)
                    binding.num9.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(9)){
                    pickNumberSet.remove(9)
                    binding.num9.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(9)
                    binding.num9.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num10.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(10)) {
                    pickNumberSet.remove(10)
                    binding.num10.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(10)){
                    pickNumberSet.remove(10)
                    binding.num10.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(10)
                    binding.num10.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num11.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(11)) {
                    pickNumberSet.remove(11)
                    binding.num11.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(11)){
                    pickNumberSet.remove(11)
                    binding.num11.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(11)
                    binding.num11.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num12.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(12)) {
                    pickNumberSet.remove(12)
                    binding.num12.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(12)){
                    pickNumberSet.remove(12)
                    binding.num12.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(12)
                    binding.num12.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num13.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(13)) {
                    pickNumberSet.remove(13)
                    binding.num13.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(13)){
                    pickNumberSet.remove(13)
                    binding.num13.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(13)
                    binding.num13.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num14.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(14)) {
                    pickNumberSet.remove(14)
                    binding.num14.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(14)){
                    pickNumberSet.remove(14)
                    binding.num14.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(14)
                    binding.num14.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num15.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(15)) {
                    pickNumberSet.remove(15)
                    binding.num15.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(15)){
                    pickNumberSet.remove(15)
                    binding.num15.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(15)
                    binding.num15.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num16.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(16)) {
                    pickNumberSet.remove(16)
                    binding.num16.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(16)){
                    pickNumberSet.remove(16)
                    binding.num16.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(16)
                    binding.num16.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num17.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(17)) {
                    pickNumberSet.remove(17)
                    binding.num17.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(17)){
                    pickNumberSet.remove(17)
                    binding.num17.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(17)
                    binding.num17.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num18.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(18)) {
                    pickNumberSet.remove(18)
                    binding.num18.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(18)){
                    pickNumberSet.remove(18)
                    binding.num18.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(18)
                    binding.num18.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num19.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(19)) {
                    pickNumberSet.remove(19)
                    binding.num19.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(19)){
                    pickNumberSet.remove(19)
                    binding.num19.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(19)
                    binding.num19.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num20.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(20)) {
                    pickNumberSet.remove(20)
                    binding.num20.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(20)){
                    pickNumberSet.remove(20)
                    binding.num20.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(20)
                    binding.num20.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num21.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(21)) {
                    pickNumberSet.remove(21)
                    binding.num21.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(21)){
                    pickNumberSet.remove(21)
                    binding.num21.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(21)
                    binding.num21.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num22.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(22)) {
                    pickNumberSet.remove(22)
                    binding.num22.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(22)){
                    pickNumberSet.remove(22)
                    binding.num22.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(22)
                    binding.num22.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num23.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(23)) {
                    pickNumberSet.remove(23)
                    binding.num23.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(23)){
                    pickNumberSet.remove(23)
                    binding.num23.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(23)
                    binding.num23.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num24.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(24)) {
                    pickNumberSet.remove(24)
                    binding.num24.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(24)){
                    pickNumberSet.remove(24)
                    binding.num24.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(24)
                    binding.num24.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num25.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(25)) {
                    pickNumberSet.remove(25)
                    binding.num25.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(25)){
                    pickNumberSet.remove(25)
                    binding.num25.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(25)
                    binding.num25.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num26.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(26)) {
                    pickNumberSet.remove(26)
                    binding.num26.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(26)){
                    pickNumberSet.remove(26)
                    binding.num26.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(26)
                    binding.num26.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num27.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(27)) {
                    pickNumberSet.remove(27)
                    binding.num27.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(27)){
                    pickNumberSet.remove(27)
                    binding.num27.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(27)
                    binding.num27.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num28.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(28)) {
                    pickNumberSet.remove(28)
                    binding.num28.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(28)){
                    pickNumberSet.remove(28)
                    binding.num28.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(28)
                    binding.num28.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num29.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(29)) {
                    pickNumberSet.remove(29)
                    binding.num29.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(29)){
                    pickNumberSet.remove(29)
                    binding.num29.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(29)
                    binding.num29.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num30.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(30)) {
                    pickNumberSet.remove(30)
                    binding.num30.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(30)){
                    pickNumberSet.remove(30)
                    binding.num30.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(30)
                    binding.num30.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num31.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(31)) {
                    pickNumberSet.remove(31)
                    binding.num31.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(31)){
                    pickNumberSet.remove(31)
                    binding.num31.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(31)
                    binding.num31.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num32.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(32)) {
                    pickNumberSet.remove(32)
                    binding.num32.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(32)){
                    pickNumberSet.remove(32)
                    binding.num32.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(32)
                    binding.num32.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num33.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(33)) {
                    pickNumberSet.remove(33)
                    binding.num33.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(33)){
                    pickNumberSet.remove(33)
                    binding.num33.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(33)
                    binding.num33.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num34.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(34)) {
                    pickNumberSet.remove(34)
                    binding.num34.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(34)){
                    pickNumberSet.remove(34)
                    binding.num34.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(34)
                    binding.num34.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num35.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(35)) {
                    pickNumberSet.remove(35)
                    binding.num35.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            } else {
                if (pickNumberSet.contains(35)){
                    pickNumberSet.remove(35)
                    binding.num35.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(35)
                    binding.num35.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num36.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(36)) {
                    pickNumberSet.remove(36)
                    binding.num36.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else {
                if (pickNumberSet.contains(36)){
                    pickNumberSet.remove(36)
                    binding.num36.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(36)
                    binding.num36.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num37.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(37)) {
                    pickNumberSet.remove(37)
                    binding.num37.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(37)){
                    pickNumberSet.remove(37)
                    binding.num37.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(37)
                    binding.num37.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num38.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(38)) {
                    pickNumberSet.remove(38)
                    binding.num38.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else {
                if (pickNumberSet.contains(38)){
                    pickNumberSet.remove(38)
                    binding.num38.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(38)
                    binding.num38.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num39.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(39)) {
                    pickNumberSet.remove(39)
                    binding.num39.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(39)){
                    pickNumberSet.remove(39)
                    binding.num39.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(39)
                    binding.num39.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num40.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(40)) {
                    pickNumberSet.remove(40)
                    binding.num40.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(40)){
                    pickNumberSet.remove(40)
                    binding.num40.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(40)
                    binding.num40.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num41.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(41)) {
                    pickNumberSet.remove(41)
                    binding.num41.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(41)){
                    pickNumberSet.remove(41)
                    binding.num41.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(41)
                    binding.num41.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num42.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(42)) {
                    pickNumberSet.remove(42)
                    binding.num42.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(42)){
                    pickNumberSet.remove(42)
                    binding.num42.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(42)
                    binding.num42.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num43.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(43)) {
                    pickNumberSet.remove(43)
                    binding.num43.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(43)){
                    pickNumberSet.remove(43)
                    binding.num43.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(43)
                    binding.num43.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num44.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(44)) {
                    pickNumberSet.remove(44)
                    binding.num44.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(44)){
                    pickNumberSet.remove(44)
                    binding.num44.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(44)
                    binding.num44.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
        binding.num45.setOnClickListener {
            if (pickNumberSet.size >= 5){
                Toast.makeText(context, "고정수는 5개까지만 선택할 수 있습니다.", Toast.LENGTH_SHORT).show()
                if (pickNumberSet.contains(45)) {
                    pickNumberSet.remove(45)
                    binding.num45.setBackgroundResource(R.drawable.button_custom)
                }else{
                    return@setOnClickListener
                }
            }else{
                if (pickNumberSet.contains(45)){
                    pickNumberSet.remove(45)
                    binding.num45.setBackgroundResource(R.drawable.button_custom)
                }else{
                    pickNumberSet.add(45)
                    binding.num45.setBackgroundResource(R.drawable.circle_blue)
                }
            }

        }
    }

    interface ButtonClickListener{
        fun onClicked(text: HashSet<Int>)
    }
    private lateinit var onClickListener: ButtonClickListener

    fun setOnClickListener(listener: DialogFix.ButtonClickListener){
        onClickListener = listener
    }

    fun setPickNumber(): HashSet<Int> {
        return pickNumberSet
    }
}