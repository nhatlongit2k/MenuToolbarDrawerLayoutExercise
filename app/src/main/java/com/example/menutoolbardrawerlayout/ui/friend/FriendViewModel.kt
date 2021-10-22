package com.example.menutoolbardrawerlayout.ui.friend

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FriendViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "you don't have any friends in your friend list"
    }
    val text: LiveData<String> = _text
}