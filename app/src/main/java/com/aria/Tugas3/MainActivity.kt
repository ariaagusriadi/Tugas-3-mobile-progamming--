package com.aria.Tugas3

import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.text.parseAsHtml
import com.aria.tokopaklatef.model.user
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val REQUEST_CODE = 100
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        simpel
        btn_profil.setOnClickListener {
            val profil = Intent(this@MainActivity, ProfilActivity::class.java)
            startActivity(profil)
        }

//        explicit
        btn_product.setOnClickListener {
            val product = Intent(this@MainActivity, ProductActivity::class.java)
            product.putExtra(ProductActivity.EXTRA_LBL, "curry flow 8 basketball shoes")
            product.putExtra(ProductActivity.EXTRA_PRICE, "$160 00")
            startActivity(product)
        }

//          product with parcelabel

        btn_parcelabel.setOnClickListener {
            val parcelable = Intent(this@MainActivity, ParcelabelActivity::class.java)
            val user = user (
                lbl = "curry 8",
                price = "Rp 2.000.000.00"
                    )
            parcelable.putExtra(ParcelabelActivity.EXTRA_USER, user)
            startActivity(parcelable)
        }



//         impilicit intent
        btn_implicit.setOnClickListener {
            val phone = "089689203086"
            val sms =Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$phone"))
            sms.putExtra( "sms_body", "Selamat anda telah terpilih jadi salah satu pemenanag undian mobill!!!")
            startActivity(sms)
        }
//        result with data
        btn_intent.setOnClickListener {
            val result = Intent(this@MainActivity, ResultActivity::class.java)
               startActivityForResult(result, REQUEST_CODE)
        }
    }

           override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
                super.onActivityResult(requestCode, resultCode, data)
                    if (resultCode == 200){
                        val color = data?.getStringExtra(ResultActivity.EXTRA_COLOR)
                        view_content.setBackgroundColor(Color.parseColor(color))
                    }
            }
}