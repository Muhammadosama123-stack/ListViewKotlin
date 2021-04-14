package com.example.listviewkotlin

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.core.graphics.createBitmap
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var favPlaces = ArrayList<String>()
        favPlaces.add("santorini")
        favPlaces.add("italy")
        favPlaces.add("paris")
        favPlaces.add("mal")

        val paris = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.paris)
        val santorini = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.santorini)
        val mal = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.mal)
        val italy = BitmapFactory.decodeResource(applicationContext.resources, R.drawable.italy)

        val favPlaceImages = ArrayList<Bitmap>()
        favPlaceImages.add(santorini)
        favPlaceImages.add(italy)
        favPlaceImages.add(paris)
        favPlaceImages.add(mal)

        val arrayadapter = ArrayAdapter(this, android.R.layout.simple_expandable_list_item_1, favPlaces)
        listView.adapter = arrayadapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { AdapterView, View, i, l ->
            val intent = Intent(applicationContext,DetailActivity::class.java)
            intent.putExtra("name", favPlaces[i])

            val bitmap = favPlaceImages[i]
            val chosen = Globals.Chosen
            chosen.chosenImage = bitmap

            startActivity(intent)
        }
    }
}