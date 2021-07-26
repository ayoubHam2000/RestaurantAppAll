package com.example.restaurantappall.Controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.WindowManager
import com.example.restaurantappall.R

class MainActivity : AppCompatActivity() {
    //to do
    // create link to the apps (admin - user - chef) -- if the apps does not exist
    // or the id doesn't exist show error
    // the admin and chef must be unique
    // give the other app the id of the restaurant
    // animate the cards

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)
    }




}
