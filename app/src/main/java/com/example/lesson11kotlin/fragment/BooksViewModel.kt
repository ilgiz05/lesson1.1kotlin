package com.example.lesson11kotlin.fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.lesson11kotlin.client.ClientBooks
import com.example.lesson11kotlin.model.NameModel

class BooksViewModel : ViewModel() {
    val description = MutableLiveData<String>()


    fun getBooks(): List<NameModel> {
        return ClientBooks.getBooks()
    }

    fun putDescription(text: String) {
        description.value = text
    }


}
