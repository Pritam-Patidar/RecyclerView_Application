package com.example.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val arrList: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addData()

       var recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        recyclerView.adapter = CustomAdapter(arrList,this)


    }
    var firstName:String = "Pritam"
    var lastName:String = "Patidar"
    var address:String = "B-67, Vidhya Nagar,Bhopal"
    private fun addData() {
        arrList.add("First Name : "+firstName)
        arrList.add("Last Name : "+lastName)
        arrList.add("Address : "+address)
    }
}