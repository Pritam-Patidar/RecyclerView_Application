package com.example.recyclerviewapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(val dataSet: ArrayList<String>, mainActivity: MainActivity) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {



    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.text_row_item, viewGroup, false)

        return ViewHolder(view)
    }



    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
     var details:String = dataSet[position]

       viewHolder.detailsText.text = details

    }

    override fun getItemCount() = dataSet.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
     val detailsText:TextView
     val detailsText1:TextView
     val detailsText2:TextView

        init {
            detailsText = view.findViewById(R.id.fName)
            detailsText1 = view.findViewById(R.id.lName)
            detailsText2 = view.findViewById(R.id.addName)
        }
    }


}