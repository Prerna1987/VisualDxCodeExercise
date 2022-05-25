package com.visualdx.codechallenge.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Filter
import android.widget.Filterable
import codechallenge.databinding.DropdownRowBinding
import com.visualdx.codechallenge.network.Currency

class customAdapter(private var items: List<Currency>?) : BaseAdapter(), Filterable {

    private var listFilter: ListFilter? = null
    // private var dataListAllItems: ArrayList<Currency> = ArrayList()

    override fun getCount(): Int = items!!.size

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        return getView(position, convertView, parent)
    }

    override fun getItem(position: Int) = items?.get(position)
    override fun getItemId(p0: Int): Long {
        return 0
    }

    //override fun getItemId(position: Int) = items!!.get(position).partyId.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        lateinit var myHolder: myAutoCompleteHolder

        if (convertView == null) {
            var layoutInflater = LayoutInflater.from(parent.context)
            val binding = DropdownRowBinding.inflate(layoutInflater)
            myHolder = myAutoCompleteHolder(binding)
            myHolder.view.tag = myHolder
            binding.dropData = items!![position]
            binding.executePendingBindings()
        } else
            myHolder = convertView.tag as myAutoCompleteHolder

        println("YY")
        return myHolder.view
    }

    inner class myAutoCompleteHolder(binding: DropdownRowBinding) {
        val view = binding.root
    }

    override fun getFilter(): Filter? {
        if (listFilter == null) {
            listFilter = ListFilter()
        }
        return listFilter
    }

    inner class ListFilter : Filter() {

        override fun performFiltering(constraint: CharSequence?): Filter.FilterResults? {
            var constraint = ""
            val results = Filter.FilterResults()

            results.count = items!!.size
            results.values = items

            return results
        }

        override fun publishResults(constraint: CharSequence?, results: Filter.FilterResults?) {
            if (!items.isNullOrEmpty()) {
                items = results?.values as ArrayList<Currency>
                notifyDataSetChanged()
            }
        }
    }
}