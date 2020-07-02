package com.example.test101.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test101.R

import com.example.test101.adapter.LaterAdapter
import com.example.test101.models.AbsenceModel
import kotlinx.android.synthetic.main.activity_later.*

class LaterActivity : AppCompatActivity() {
    private var laterAdapter: LaterAdapter? = null
    private val laterList: ArrayList<AbsenceModel> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_later)
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        laterList.add(AbsenceModel("MONDAY", "12/12/2012"))
        rv.layoutManager = LinearLayoutManager(
                this, RecyclerView.VERTICAL, false
        ) as RecyclerView.LayoutManager?
        laterAdapter = LaterAdapter(this, laterList)
        rv.adapter = laterAdapter
    }
}