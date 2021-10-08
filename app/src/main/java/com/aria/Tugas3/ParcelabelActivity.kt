package com.aria.Tugas3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aria.tokopaklatef.model.user
import kotlinx.android.synthetic.main.activity_product.*

class ParcelabelActivity : AppCompatActivity() {

    companion object{
        const val  EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val user = intent.getParcelableExtra<user>(EXTRA_USER) as user

        txt_lbl.text = user.lbl
        txt_price.text = user.price

        btn_back.setOnClickListener{
            val back = Intent(this@ParcelabelActivity, MainActivity::class.java)
            startActivity(back)
        }
    }
}