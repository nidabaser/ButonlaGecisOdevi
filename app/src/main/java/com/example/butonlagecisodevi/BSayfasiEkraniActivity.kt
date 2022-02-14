package com.example.butonlagecisodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.butonlagecisodevi.databinding.ActivityAsayfasiEkraniBinding
import com.example.butonlagecisodevi.databinding.ActivityBsayfasiEkraniBinding

class BSayfasiEkraniActivity : AppCompatActivity() {

    private lateinit var tasarim: ActivityBsayfasiEkraniBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityBsayfasiEkraniBinding.inflate(layoutInflater)

        setContentView(tasarim.root)

        tasarim.buttonYgit.setOnClickListener {

            val intent = Intent(this@BSayfasiEkraniActivity,YSayfasiEkraniActivity::class.java)
            startActivity(intent)
        }
    }
}