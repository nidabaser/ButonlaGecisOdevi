package com.example.butonlagecisodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.butonlagecisodevi.databinding.ActivityAsayfasiEkraniBinding

class ASayfasiEkraniActivity : AppCompatActivity() {

    private lateinit var tasarim: ActivityAsayfasiEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityAsayfasiEkraniBinding.inflate(layoutInflater)

        setContentView(tasarim.root)

        tasarim.buttonBgit.setOnClickListener {

            val intent = Intent(this@ASayfasiEkraniActivity,BSayfasiEkraniActivity::class.java)
            startActivity(intent)
        }
    }
}