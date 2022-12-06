package com.example.livedatastudy

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.livedatastudy.databinding.ItemMydataBinding

class ItemAdapter : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    var itemList = mutableListOf<MyItem>()

    inner class ViewHolder(private val binding: ItemMydataBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MyItem) {
            binding.mydata = item
            binding.mydata.let { gg ->
                gg!!.priorityCount.observe(MainActivity()) {
                    gg.priority = it.toString()
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = ItemMydataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int = itemList.size
}