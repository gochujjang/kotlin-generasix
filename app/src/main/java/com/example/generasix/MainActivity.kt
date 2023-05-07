package com.example.generasix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inisialisasi komponen
        var etTgl = findViewById<EditText>(R.id.et_tgl)
        var btnClick = findViewById<Button>(R.id.btn_click)
        var tvHasil = findViewById<TextView>(R.id.tv_hasil)

        btnClick.setOnClickListener{
            val input = etTgl.text.toString()
            val hasil = when (input.toInt()){
                in 1946..1964 -> "Baby boomers"
                in 1965..1980 -> "X"
                in 1981..1995 -> "Millenial"
                in 1996..2010 -> "Z"
                else -> "Gak tau mas"
            }
            tvHasil.text = "Kamu generasi $hasil"
        }
    }
}