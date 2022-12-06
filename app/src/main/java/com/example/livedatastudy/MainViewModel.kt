package com.example.livedatastudy

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _itemList = MutableLiveData<MutableList<MyItem>>()
    val itemList = _itemList
    private val items = mutableListOf<MyItem>().apply {
        add(MyItem("test","1"))
        add(MyItem("test","2"))
        add(MyItem("test","3"))
    }
    fun putData() {
        Log.e("click", "yes")
        val item = MyItem("test", "4")
        items.add(item)
        _itemList.value = items
    }
}