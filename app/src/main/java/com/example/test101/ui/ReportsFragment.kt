package com.example.test101.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test101.R
import com.example.test101.adapter.ReportsAdapter
import com.example.test101.models.ReportsModel
import kotlinx.android.synthetic.main.fragment_reports.*

class ReportsFragment : Fragment() {
    private var reportsAdapter: ReportsAdapter? = null
    private val reportsList: ArrayList<ReportsModel> = arrayListOf()
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_reports, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        reportsList.add(ReportsModel("fffff", "90:90"))
        reportsList.add(ReportsModel("fffff", "90:90"))
        reportsList.add(ReportsModel("fffff", "90:90"))
        reportsList.add(ReportsModel("fffff", "90:90"))
        reportsList.add(ReportsModel("fffff", "90:90"))
        reportsList.add(ReportsModel("fffff", "90:90"))
        reportsList.add(ReportsModel("fffff", "90:90"))
        reportsList.add(ReportsModel("fffff", "90:90"))
        reportsList.add(ReportsModel("fffff", "90:90"))
        rv.layoutManager = GridLayoutManager(
                this.requireContext(),2, RecyclerView.VERTICAL, false
        ) as RecyclerView.LayoutManager?
        reportsAdapter = ReportsAdapter(this.requireActivity(), reportsList)
        rv.adapter = reportsAdapter
    }
}