package com.example.livedatastudy

import android.content.Context
import android.util.Log
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

object MyBindingAdapter {
    @BindingAdapter("app:items")
    @JvmStatic
    fun setThis(recyclerView: RecyclerView, items: MutableList<MyItem>?) {
        if (recyclerView.adapter == null) {
            Log.e("init","adapter")
            val adapter = ItemAdapter()
            adapter.setHasStableIds(true)
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(MainActivity().baseContext)
        }

        val myAdapter = recyclerView.adapter as ItemAdapter
        items?.let {
            myAdapter.itemList = items
        }
        myAdapter.notifyDataSetChanged()
    }
}