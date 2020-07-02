package com.example.test101.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test101.R
import com.example.test101.models.ReportsModel
import kotlinx.android.synthetic.main.item_reports_fragament.view.*

class AbsenceAdapter(private val mActivity: Activity,
                     private val reportsList: ArrayList<ReportsModel>) :
        RecyclerView.Adapter<AbsenceAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(mActivity)
                    .inflate(R.layout.item_reports_fragament, parent, false))


    override fun getItemCount(): Int = reportsList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvItemReport.text = reportsList[position].tvItemReport
        holder.tvItemTime.text = reportsList[position].tvItemTime
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItemReport = view.tv_item_report!!
        val tvItemTime = view.tv_item_time!!
    }
}