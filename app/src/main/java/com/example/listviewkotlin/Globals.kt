package com.example.listviewkotlin

import android.graphics.Bitmap

class Globals {
    companion object Chosen{
        var chosenImage : Bitmap? = null
        fun returnImages():Bitmap{
          return chosenImage!!
        }
    }


}