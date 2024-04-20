package com.bintina.realestatemanagermvvm.realestate.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bintina.realestatemanagermvvm.databinding.FragmentListPropertiesBinding
import com.bintina.realestatemanagermvvm.realestate.view.adapter.Adapter

class ListPropertiesFragment(): Fragment() {

    lateinit var adapter: com.bintina.realestatemanagermvvm.realestate.view.adapter.Adapter

    private var _binding: FragmentListPropertiesBinding? = null
    private val binding get()= _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentListPropertiesBinding.inflate(inflater, container, false)

        initializeViews()

        return binding.root
    }

    private fun initializeViews() {
        adapter = Adapter()
        binding.propertiesListRecyclerContainer.adapter = adapter
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}