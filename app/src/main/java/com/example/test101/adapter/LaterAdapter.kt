package com.example.test101.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.test101.R
import com.example.test101.models.AbsenceModel
import kotlinx.android.synthetic.main.item_absence.view.*


class LaterAdapter(private val mActivity: Activity,
                   private val absenceList: ArrayList<AbsenceModel>) :
        RecyclerView.Adapter<LaterAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
            ViewHolder(LayoutInflater.from(mActivity)
                    .inflate(R.layout.item_later, parent, false))


    override fun getItemCount(): Int = absenceList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}