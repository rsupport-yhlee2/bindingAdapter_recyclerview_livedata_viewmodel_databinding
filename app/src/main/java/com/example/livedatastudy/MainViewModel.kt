package com.example.livedatastudy

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    private val _itemList = MutableLiveData<MutableList<MyItem>>()
    val itemList = _itemList
    private val items = mutableListOf<MyItem>()
    fun putData(title: String) {
        val item = MyItem(title, "0")
        items.add(item)
        _itemList.value = items
    }
}