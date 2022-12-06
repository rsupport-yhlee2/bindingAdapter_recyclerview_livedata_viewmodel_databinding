package com.example.livedatastudy

import android.util.Log
import androidx.lifecycle.MutableLiveData

data class MyItem(
    val title: String,
    var priority: String
) {
    private val _priorityCount = MutableLiveData<Int>()
    val priorityCount = _priorityCount
    fun up() {
        Log.e("123","${_priorityCount.value}")
        priority = (priority.toInt() + 1).toString()
        _priorityCount.value = priority.toInt() + 1
    }

    fun down() {
        Log.e("123","${_priorityCount.value}")
        priority = (priority.toInt() - 1).toString()
        _priorityCount.value = priority.toInt() - 1
    }

    fun delete() {
        Log.e("hello","hi")
    }
}
