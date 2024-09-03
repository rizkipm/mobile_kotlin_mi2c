package com.rizki.mobileappmi2c

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  lateinit var btnClick : Button
    private lateinit var btnPageKedua : Button
    private lateinit var btnKalkulator : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        btnClick = findViewById(R.id.btnClickHere)
        btnPageKedua = findViewById(R.id.btnPageKedua)
        btnKalkulator = findViewById(R.id.btnKalkulatorSederhana)

        //untuk 1 screen --> terdiri dari 1 activity dan 1 xml layout
        //untuk bisa widget kita pakai, kita deklarasi dlu
        //kita deklarasi findviewby id

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        btnClick.setOnClickListener(){
            Toast.makeText(this, "Anda klik button click here!", Toast.LENGTH_SHORT).show()
        }

        btnPageKedua.setOnClickListener(){
            //untuk pindah page : intent
            //intent 2 : intent implicit dan intent explicit
            //inten implicit : intent kita buat sendiri dan yang belaku didalam project
            //intent expilicit : kita memanggil pihak ketiga / third party / libray : gmaps, gps,
            val intentMenu2 = Intent(this@MainActivity, PageKeduaActivity::class.java)
            startActivity(intentMenu2)
        }
        btnKalkulator.setOnClickListener(){
            //untuk pindah page : intent
            //intent 2 : intent implicit dan intent explicit
            //inten implicit : intent kita buat sendiri dan yang belaku didalam project
            //intent expilicit : kita memanggil pihak ketiga / third party / libray : gmaps, gps,
            val intentMenu2 = Intent(this@MainActivity, KalkulatoSederhanaActivity::class.java)
            startActivity(intentMenu2)
        }
    }
}