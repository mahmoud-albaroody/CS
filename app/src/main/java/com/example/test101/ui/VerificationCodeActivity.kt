package com.example.test101.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.test101.R
import com.example.test101.utils.customToast
import com.example.test101.utils.extentions.setSafeOnClickListener
import kotlinx.android.synthetic.main.activity_verification_code.*

class VerificationCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verification_code)
        btn_confirm.setSafeOnClickListener {
            if (text_input_extension_enterIdentityNum.text.isNullOrBlank()) {
                customToast(getString(R.string.wrong_mobile_num))
            } else {
                startActivity(Intent(this, HomeActivity::class.java))
            }
        }
    }
}