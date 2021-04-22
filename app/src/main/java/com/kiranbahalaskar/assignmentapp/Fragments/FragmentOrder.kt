package com.kiranbahalaskar.assignmentapp.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kiranbahalaskar.assignmentapp.Adapters.CategoryAdapters
import com.kiranbahalaskar.assignmentapp.R


class FragmentOrder : Fragment() {

    private lateinit var recyclerviewCategory : RecyclerView
    private lateinit var adapter : CategoryAdapters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_order, container, false)


        recyclerviewCategory = view.findViewById(R.id.recyclerviewCategory)
        adapter = CategoryAdapters()
        recyclerviewCategory.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        recyclerviewCategory.adapter = adapter

        return view
    }

}