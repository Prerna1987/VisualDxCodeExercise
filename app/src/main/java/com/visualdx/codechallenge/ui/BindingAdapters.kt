package com.visualdx.codechallenge.ui

import androidx.databinding.BindingAdapter
import com.google.android.material.textfield.MaterialAutoCompleteTextView
import com.visualdx.codechallenge.network.Currency


@BindingAdapter("entries", requireAll = false)
fun MaterialAutoCompleteTextView.bindAdapter(
    entries: List<Currency>
) {
    println("entry size ${entries.size}")
    // ArrayAdapter(context, android.R.layout.simple_list_item_1, android.R.id.text1, entries)
    setAdapter(customAdapter(entries))
}


