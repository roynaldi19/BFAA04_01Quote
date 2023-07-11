package com.roynaldi19.dc3_04quote

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.roynaldi19.dc3_04quote.databinding.ItemQuoteBinding


class QuoteAdapter(private val listReview: ArrayList<String>) :
    RecyclerView.Adapter<QuoteAdapter.ListViewHolder>() {
    class ListViewHolder(var binding: ItemQuoteBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): QuoteAdapter.ListViewHolder {
        val binding = ItemQuoteBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListViewHolder(binding)
    }

    override fun onBindViewHolder(holder: QuoteAdapter.ListViewHolder, position: Int) {
        holder.binding.tvItem.text = listReview[position]
    }

    override fun getItemCount() = listReview.size

}