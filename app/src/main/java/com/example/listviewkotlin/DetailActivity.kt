package com.example.listviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.activity_main.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val intent = intent
        val name = intent.getStringExtra("name")
        textView.text = name

        val chosen = Globals.Chosen
        val selectedImage = chosen.returnImages()
        imageView.setImageBitmap(selectedImage)

    }
}