package com.example.carservice.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.carservice.R

class AvailabilityAdapter : RecyclerView.Adapter<AvailabilityAdapter.ViewHolder>() {

    private val availabilityList = mutableListOf<String>()

    fun submitList(list: List<String>) {
        availabilityList.clear()
        availabilityList.addAll(list)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_availability, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(availabilityList[position])
    }

    override fun getItemCount(): Int = availabilityList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val tvAvailability: TextView = itemView.findViewById(R.id.tvAvailability)

        fun bind(availability: String) {
            tvAvailability.text = availability
        }
    }
}
