package com.example.lotto.ui.pension.statistics

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lotto.R

class PensionRecyclerViewAdapter(private val itemList: ArrayList<Int>, private val i : Int) :RecyclerView.Adapter<PensionRecyclerViewAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (itemList.size == 5){
            holder.progress.max = itemList.max()
            holder.name.text = (position+1).toString()
            holder.progress.progress = itemList[position]
            holder.count.text = itemList[position].toString() + "회"
            setNumberBackGround(position+1,holder.name, i)
        }else{
            holder.progress.max = itemList.max()
            holder.name.text = (position).toString()
            holder.progress.progress = itemList[position]
            holder.count.text = itemList[position].toString() + "회"
            setNumberBackGround(position+1,holder.name, i)
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.ballnumber)
        val count: TextView = itemView.findViewById(R.id.ballcount)
        val progress: ProgressBar = itemView.findViewById(R.id.progressBar)
    }

    private fun setNumberBackGround(number: Int, textView: TextView, i: Int){
        when(i){ // 숫자별로 색깔 꾸미기
            0 -> textView.setBackgroundResource(R.drawable.circle_jo)
            1 -> textView.setBackgroundResource(R.drawable.circle_red)
            2 -> textView.setBackgroundResource(R.drawable.circle_orange)
            3 -> textView.setBackgroundResource(R.drawable.circle_yello)
            4 -> textView.setBackgroundResource(R.drawable.circle_blue)
            5 -> textView.setBackgroundResource(R.drawable.circle_purple)
            6 -> textView.setBackgroundResource(R.drawable.circle_gray)
        }
    }
}