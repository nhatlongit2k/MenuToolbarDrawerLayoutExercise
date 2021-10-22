package com.example.menutoolbardrawerlayout.ui.groupchat

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GroupchatViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "You are not a member of any groups"
    }
    val text: LiveData<String> = _text
}