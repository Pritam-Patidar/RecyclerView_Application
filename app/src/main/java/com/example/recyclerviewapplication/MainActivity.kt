package com.example.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.GridLayoutManager as GridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val arrContact = ArrayList<UserEntity>()
        
        arrContact.add(UserEntity("Pritam", "Patidar"))
        arrContact.add(UserEntity("Lakhan", "Patidar"))
        arrContact.add(UserEntity("xyz", "Patidar"))
        arrContact.add(UserEntity("Pavan", "Patidar"))

        val recyclerView: RecyclerView? = null

        if (recyclerView != null) {
            recyclerView.layoutManager = GridLayoutManager(this,2)
        }
        

    }
}