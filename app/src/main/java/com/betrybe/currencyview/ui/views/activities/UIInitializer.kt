package com.betrybe.currencyview.ui.views.activities

import android.content.Context
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.currencyview.R
import com.betrybe.currencyview.ui.adapters.CurrencyAdapter

class UIInitializer(
    private val context: Context,
    private val autoCompleteTextView: AutoCompleteTextView,
    private val textSelectCurrency: TextView,
    private val recyclerView: RecyclerView
) {
    fun initializeAutoCompleteTextView(symbols: List<String>) {
        val adapter = ArrayAdapter(context, R.layout.card_item, symbols)
        autoCompleteTextView.setAdapter(adapter)
        textSelectCurrency.visibility = View.VISIBLE
    }

    fun initializeRecyclerView(rates: List<Pair<String, Double>>) {
        val adapter = CurrencyAdapter(rates)
        recyclerView.apply {
            visibility = View.VISIBLE
            layoutManager = LinearLayoutManager(context)
            this.adapter = adapter
        }
        textSelectCurrency.visibility = View.GONE
    }
}