package com.betrybe.currencyview.ui.views.activities

import android.os.Bundle
import android.view.View
import android.widget.AutoCompleteTextView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.betrybe.currencyview.R
import com.betrybe.currencyview.data.repository.CurrencyRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import com.betrybe.currencyview.ui.adapters.ClickListner

class MainActivity : AppCompatActivity(), ClickListner {
    private val textSelectCurrency: TextView by lazy { findViewById(R.id.select_currency_state) }
    private val autoCompleteTextView: AutoCompleteTextView by lazy { findViewById(R.id.currency_selection_input_layout) }
    private val recyclerView: RecyclerView by lazy { findViewById(R.id.currency_rates_state) }

    private val coroutineScope = CoroutineScope(Dispatchers.IO)
    private lateinit var uiInitializer: UIInitializer
    private val currencyRepository = CurrencyRepository()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        uiInitializer = UIInitializer(this, autoCompleteTextView, textSelectCurrency, recyclerView)
        loadSymbols()
    }

    private fun loadSymbols() {
        coroutineScope.launch {
            val result = currencyRepository.fetchSymbols()
            withContext(Dispatchers.Main) {
                result.onSuccess { symbols ->
                    val symbolList = symbols.keys.toList()
                    uiInitializer.initializeAutoCompleteTextView(symbolList)
                }.onFailure {
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        autoCompleteTextView.setOnItemClickListener { parent, view, position, id ->
            val symbol = parent.adapter.getItem(position).toString()
            onClickCurrency(view, symbol)
        }
    }

    override fun onClickCurrency(view: View, symbol: String) {
        coroutineScope.launch {
            val result = currencyRepository.fetchLatestRates(symbol)
            withContext(Dispatchers.Main) {
                result.onSuccess { rates ->
                    val rateList = rates.toList()
                    uiInitializer.initializeRecyclerView(rateList)
                }.onFailure {
                }
            }
        }
    }
}