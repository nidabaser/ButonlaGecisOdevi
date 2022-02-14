package com.example.butonlagecisodevi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.butonlagecisodevi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        tasarim = ActivityMainBinding.inflate(layoutInflater)

        setContentView(tasarim.root)

        tasarim.buttonAgit.setOnClickListener {

            val intent = Intent(this@MainActivity,ASayfasiEkraniActivity::class.java)
            startActivity(intent)

        }

        tasarim.buttonXgit.setOnClickListener {

            val intent = Intent(this@MainActivity,XSayfasiEkraniActivity::class.java)
            startActivity(intent)

        }



    }
}