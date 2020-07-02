package com.example.test101.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.test101.R
import com.example.test101.adapter.AbsenceAdapter
import com.example.test101.models.AbsenceModel
import kotlinx.android.synthetic.main.activity_absence.*


class AbsenceActivity : AppCompatActivity() {
    private var absenceAdapter: AbsenceAdapter? = null
    private val absenceList: ArrayList<AbsenceModel> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_absence)
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        absenceList.add(AbsenceModel("MONDAY", "12/12/2012"))
        rv.layoutManager = LinearLayoutManager(
                this, RecyclerView.VERTICAL, false
        ) as RecyclerView.LayoutManager?
        absenceAdapter = AbsenceAdapter(this, absenceList)
        rv.adapter = absenceAdapter
    }
}