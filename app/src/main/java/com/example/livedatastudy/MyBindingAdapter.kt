package com.example.livedatastudy

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

object MyBindingAdapter {
    @BindingAdapter("app:items")
    @JvmStatic
    fun setList(recyclerView: RecyclerView, items: MutableList<MyItem>?) {
        if (recyclerView.adapter == null) {
            val adapter = ItemAdapter()
            adapter.setHasStableIds(true)
            recyclerView.adapter = adapter
        }

        val myAdapter = recyclerView.adapter as ItemAdapter

        items?.let {
            myAdapter.itemList = items
        }
        myAdapter.notifyDataSetChanged()
    }
}