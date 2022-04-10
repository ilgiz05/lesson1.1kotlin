package com.example.lesson11kotlin.fragment

import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.lesson11kotlin.R
import com.example.lesson11kotlin.base.Base
import com.example.lesson11kotlin.databinding.FragmentHomeBinding
import com.example.lesson11kotlin.model.NameModel
import com.example.lesson11kotlin.ui.adapter.AdapterName


class HomeFragment : Base<FragmentHomeBinding>(
    R.layout.fragment_home
) {
    override val binding: FragmentHomeBinding by viewBinding(FragmentHomeBinding::bind)
    private val sharedViewModel: BooksViewModel by activityViewModels()
    private val adapter = AdapterName(this::onClick)



    override fun setupViews() {
        initAdapter()
    }

    private fun initAdapter() {
        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        adapter.setList(sharedViewModel.getBooks())


    }

    private fun onClick(model: NameModel) {
        sharedViewModel.putDescription(model.description)
        findNavController().navigate(R.id.detailsFragment)
    }
}
