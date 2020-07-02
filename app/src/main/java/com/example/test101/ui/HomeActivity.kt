package com.example.test101.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.test101.R
import kotlinx.android.synthetic.main.activity_home.*


class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        fragmentTransaction(MoreFragment())

        bottomNavigationView?.menu?.findItem(R.id.settingsFragment)?.setOnMenuItemClickListener{
            fragmentTransaction(MoreFragment())
            return@setOnMenuItemClickListener true
        }
        bottomNavigationView?.menu?.findItem(R.id.reportFragment)?.setOnMenuItemClickListener{
            fragmentTransaction(ReportsFragment())
            return@setOnMenuItemClickListener true
        }
    }

    private fun fragmentTransaction(fragment: Fragment) {
//        when (fragment) {
//            is AddSendPackageFragment ->
//                supportFragmentManager.beginTransaction()
//                        .replace(R.id.fragment_replace, fragment, "AddSendPackageFragment").commit()
//            else ->


        supportFragmentManager.beginTransaction()
                .replace(R.id.mainFragment, fragment).commit()

    }


}