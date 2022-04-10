package com.example.lesson11kotlin.fragment

import androidx.fragment.app.activityViewModels
import androidx.lifecycle.lifecycleScope
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lesson11kotlin.R
import com.example.lesson11kotlin.base.Base
import com.example.lesson11kotlin.databinding.FragmentDetailsBinding
import kotlinx.coroutines.launch

class DetailsFragment: Base<FragmentDetailsBinding>(
    R.layout.fragment_details
) {
    override val binding: FragmentDetailsBinding by viewBinding(FragmentDetailsBinding::bind)
    private val sharedViewModel: BooksViewModel by activityViewModels()

    override fun setupViews() {
        viewLifecycleOwner.lifecycleScope.launch {
            sharedViewModel.description.observe(viewLifecycleOwner) { description ->
                binding.tvDescription.text = description.toString()

            }


        }
    }


}