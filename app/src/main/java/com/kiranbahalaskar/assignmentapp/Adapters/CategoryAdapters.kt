package com.kiranbahalaskar.assignmentapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kiranbahalaskar.assignmentapp.R

class CategoryAdapters(): RecyclerView.Adapter<CategoryAdapters.CategoryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_category, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 25
    }

    class CategoryViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    }
}