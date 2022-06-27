package com.example.recyclerviewapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer

class NameActivity : AppCompatActivity() {

//    private val model: NameViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_name)

          val nameObserver = Observer<String> { newName ->
//              fName.text = newName
            }

//            model.currentName.observe(this, nameObserver)
        }
    }
