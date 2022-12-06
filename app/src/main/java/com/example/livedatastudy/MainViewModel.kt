package com.example.livedatastudy

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _itemList = MutableLiveData<MutableList<MyItem>>()
    val itemList = _itemList
    private val items = mutableListOf<MyItem>()
    fun putData() {
        val item = MyItem("test", "${items.size}")
        items.add(item)
        _itemList.value = items
    }
}