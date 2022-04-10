package com.example.lesson11kotlin.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson11kotlin.databinding.ItemNameBinding
import com.example.lesson11kotlin.model.NameModel

class AdapterName(
    val onItemClickListener: (model: NameModel) -> Unit
) : RecyclerView.Adapter<AdapterName.BooksViewHolder>() {
    private var list: List<NameModel> = arrayListOf()


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AdapterName.BooksViewHolder {
        return BooksViewHolder(
            ItemNameBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AdapterName.BooksViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    fun setList(list: List<NameModel>) {
        this.list = list
    }


    override fun getItemCount(): Int {
        return list.size
    }

    inner class BooksViewHolder(private val binding: ItemNameBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(nameModel: NameModel) {
            binding.tvName.text = nameModel.title
            binding.myBook.setImageResource(nameModel.image)
            binding.root.setOnClickListener {
                onItemClickListener(nameModel)
            }
        }
    }
}


