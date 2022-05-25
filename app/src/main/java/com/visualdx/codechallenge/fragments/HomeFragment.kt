package com.visualdx.codechallenge.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import codechallenge.databinding.FragmentHomeBinding
import com.visualdx.codechallenge.ExerciseApplication
import com.visualdx.codechallenge.MainActivity
import com.visualdx.codechallenge.network.Currency
import com.visualdx.codechallenge.repository.CurrencyViewModel
import com.visualdx.codechallenge.repository.MyCurrencyModelFactory
import javax.inject.Inject


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


private lateinit var bindingHome: FragmentHomeBinding

class HomeFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bindingHome = FragmentHomeBinding.inflate(inflater, container, false)
        return bindingHome.root
    }

    lateinit var viewModel: CurrencyViewModel

    @Inject
    lateinit var factory: MyCurrencyModelFactory

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity?.application as ExerciseApplication).applicationComponent.inject(this)
        viewModel = ViewModelProvider(this, factory).get(CurrencyViewModel::class.java)
        bindingHome.viewModel = viewModel
        bindingHome.lifecycleOwner = viewLifecycleOwner
        bindingHome.tvAutoComplete.setOnItemClickListener { parent, _, position, _ ->
            var selectedCurrency = parent.adapter.getItem(position) as Currency
            viewModel.setSelection(selectedCurrency)
            bindingHome.tvAutoComplete.setText(selectedCurrency.name + ":" + selectedCurrency.fullName)
        }
        bindingHome.textInputLayout.setEndIconOnClickListener {
            (activity as MainActivity?)!!.handleFragments(AccountFragment())
        }
    }
}