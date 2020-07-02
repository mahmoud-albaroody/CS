package com.example.test101.utils.extentions

import android.view.View
import com.pointability.technicalSupport.helper.SafeClickListener

fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}