package com.example.test101.utils

import android.app.Activity
import android.graphics.Typeface
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.pointability.technicalSupport.R


fun Activity.customToast(message:String) {
    val toast = Toast.makeText(this, message, Toast.LENGTH_LONG)

    val view = toast.view
  // view.setBackgroundResource(R.drawable.profile_bg_tv)
    view.setBackgroundColor(ContextCompat.getColor(this, R.color.blackish))
    val text = view.findViewById(android.R.id.message) as TextView
    text.setPadding(15, 5, 15, 5)
    text.setTextColor(ContextCompat.getColor(this,R.color.white))
    text.setTypeface(null, Typeface.BOLD)
    toast.show()
}
