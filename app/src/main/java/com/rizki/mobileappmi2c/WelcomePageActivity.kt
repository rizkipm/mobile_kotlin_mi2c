package com.rizki.mobileappmi2c

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WelcomePageActivity : AppCompatActivity() {

    private lateinit var txtHasil : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_welcome_page)
        txtHasil = findViewById(R.id.txtWelcome)


        //mengambil data yg tadi sudah di kirim atau put
        val getUsername = intent.getStringExtra("username")
        val getPassword = intent.getStringExtra("password")

        txtHasil.setText("Hello ${getUsername} ! Password anda adalah : ${getPassword}")

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}