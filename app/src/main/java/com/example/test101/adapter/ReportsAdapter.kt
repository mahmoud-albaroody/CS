package com.example.test101.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test101.R
import com.example.test101.models.ReportsModel
import com.example.test101.ui.AbsenceActivity
import com.example.test101.ui.LaterActivity
import com.example.test101.utils.extentions.setSafeOnClickListener
import kotlinx.android.synthetic.main.item_reports_fragament.view.*

class ReportsAdapter(private val mActivity: Activity,
                     private val reportsList: ArrayList<ReportsModel>) :
        RecyclerView.Adapter<ReportsAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(mActivity)
                    .inflate(R.layout.item_reports_fragament, parent, false))


    override fun getItemCount(): Int = reportsList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvItemReport.text = reportsList[position].tvItemReport
        holder.tvItemTime.text = reportsList[position].tvItemTime
        if (position == 0) {
            holder.constraint.setSafeOnClickListener {
                mActivity.startActivity(Intent(mActivity, AbsenceActivity::class.java))
            }
        }else{
            holder.constraint.setSafeOnClickListener {
                mActivity.startActivity(Intent(mActivity, LaterActivity::class.java))
            }
        }

    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItemReport = view.tv_item_report!!
        val tvItemTime = view.tv_item_time!!
        val constraint = view.constraint!!

    }
}