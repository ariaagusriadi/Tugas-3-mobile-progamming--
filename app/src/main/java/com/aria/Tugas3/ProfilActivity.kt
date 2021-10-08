package com.aria.Tugas3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_profil.*

class ProfilActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)


        button_biru.setOnClickListener{
            button_biru.text = "Following"
            lbl_followers.text = "873"
        }

        btn_back.setOnClickListener {
            val back = Intent(this@ProfilActivity, MainActivity::class.java)
            startActivity(back)
        }

    }
}