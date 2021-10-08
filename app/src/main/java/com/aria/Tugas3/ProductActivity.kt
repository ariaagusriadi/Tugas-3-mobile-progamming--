package com.aria.Tugas3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_product.*
import kotlinx.android.synthetic.main.activity_profil.*
import kotlinx.android.synthetic.main.activity_profil.btn_back

class ProductActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_LBL = "extra_lbl"
        const val  EXTRA_PRICE = "extra_price"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        txt_price.text = intent.getStringExtra(EXTRA_PRICE)
        txt_lbl.text = intent.getStringExtra(EXTRA_LBL)

        btn_back.setOnClickListener {
            val back = Intent(this@ProductActivity, MainActivity::class.java)
            startActivity(back)
        }

    }
}