package com.example.test101.utils.extentions

import android.view.View
import com.example.test101.utils.SafeClickListener


fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}