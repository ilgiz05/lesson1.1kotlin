package com.example.lesson11kotlin.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class Base<Binding : ViewBinding>(@LayoutRes layoutId: Int) : Fragment(
    layoutId
) {
    protected abstract val binding: ViewBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
        setupViews()
    }


    open fun initListeners() {

    }


    open fun setupViews() {

    }


}