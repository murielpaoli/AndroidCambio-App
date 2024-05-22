package com.betrybe.currencyview.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.currencyview.R

class CurrencyAdapter(private val list: List<Pair<String, Double>>) : RecyclerView.Adapter<CurrencyAdapter.RateViewHolder>() {
    class RateViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val name: TextView = view.findViewById(R.id.name_card)
        val rate: TextView = view.findViewById(R.id.rate_card)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RateViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_cards, parent, false)
        return RateViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RateViewHolder, position: Int) {
        val currencyPair = list[position]
        holder.name.text = currencyPair.first
        holder.rate.text = currencyPair.second.toString()
    }
}