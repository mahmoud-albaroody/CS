package com.example.test101.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test101.R
import com.example.test101.models.AbsenceModel
import kotlinx.android.synthetic.main.item_absence.view.*


class AbsenceAdapter(private val mActivity: Activity,
                     private val absenceList: ArrayList<AbsenceModel>) :
        RecyclerView.Adapter<AbsenceAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(mActivity)
                    .inflate(R.layout.item_absence, parent, false))


    override fun getItemCount(): Int = absenceList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.day.text = absenceList[position].day
        holder.date.text = absenceList[position].date
    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val day = view.day!!
        val date = view.date!!
    }
}