package com.rizki.mobileappmi2c

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailBuah : AppCompatActivity() {

    private lateinit var txtDetailBuah : TextView
    private lateinit var txtDetailLokasi : TextView
    private lateinit var txtDetailDesk : TextView
    private lateinit var imgDetailBuah : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_buah)

        txtDetailBuah = findViewById(R.id.txtDetailBuah)
        imgDetailBuah = findViewById(R.id.imgDetailBuah)
        txtDetailLokasi = findViewById(R.id.txtDetailLokasi)
        txtDetailDesk = findViewById(R.id.txtDetailDeksripsi)

        //get data dari intent
        val detailTeks = intent.getStringExtra("judul")
        val detailLokasi = intent.getStringExtra("lokasi")
        val detailDesk = intent.getStringExtra("deksripsi")
        val detailImg = intent.getIntExtra("image", 0)

        //set data ke widget
        txtDetailBuah.setText(detailTeks)
        txtDetailLokasi.setText(detailLokasi)

//        txtDetailDesk.setText((detailDesk.toString()));
        txtDetailDesk.setText(detailDesk)
        imgDetailBuah.setImageResource(detailImg)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}