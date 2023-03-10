package com.example.lotto.ui.lotto.statistics

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lotto.R

class RecycleAdapter(private val itemList: ArrayList<String>): RecyclerView.Adapter<RecycleAdapter.ViewHolder>() {
    // (1) 아이템 레이아웃과 결합
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }
    // (2) 리스트 내 아이템 개수
    override fun getItemCount(): Int {
        return itemList.size
    }
    // (3) View에 내용 입력
    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = (position+1).toString()
        setNumberBackGround(position+1,holder.name)
        holder.count.text = itemList[position] + "회"
        holder.progress.max = itemList.max().toInt()
        holder.progress.progress = itemList[position].toInt()
    }
    // (4) 레이아웃 내 View 연결
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.ballnumber)
        val count: TextView = itemView.findViewById(R.id.ballcount)
        val progress: ProgressBar = itemView.findViewById(R.id.progressBar)
    }
    private fun setNumberBackGround(number: Int, textView: TextView){
        when(number){ // 숫자별로 색깔 꾸미기
            in 1..10 -> textView.setBackgroundResource(R.drawable.circle_yello)
            in 11..20 -> textView.setBackgroundResource(R.drawable.circle_blue)
            in 21..30 -> textView.setBackgroundResource(R.drawable.circle_red)
            in 31..40 -> textView.setBackgroundResource(R.drawable.circle_gray)
            in 41..50 -> textView.setBackgroundResource(R.drawable.circle_green)
        }
    }
}



