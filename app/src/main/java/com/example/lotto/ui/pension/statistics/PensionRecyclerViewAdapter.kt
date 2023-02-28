package com.example.lotto.ui.pension.statistics

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lotto.R

class PensionRecyclerViewAdapter(private val itemList: MutableList<String>) :RecyclerView.Adapter<PensionRecyclerViewAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PensionRecyclerViewAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_recycler, parent, false)
        return ViewHolder(view)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: PensionRecyclerViewAdapter.ViewHolder, position: Int) {
        holder.name.text = (position).toString() + "번"
        holder.count.text = itemList[position] + "회"
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val name: TextView = itemView.findViewById(R.id.ballnumber)
        val count: TextView = itemView.findViewById(R.id.ballcount)
    }
}