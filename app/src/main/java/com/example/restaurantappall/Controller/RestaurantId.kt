package com.example.restaurantappall.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.restaurantappall.R

class RestaurantId : AppCompatActivity() {

    //check if the id exist in the app data then the file of the app
    //if it is valid go to the other activity
    //if not ask it and save it the app and also create the file
    //create table unique id and send it to the server
    //the user mast specified the table number

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_id)
    }
}
