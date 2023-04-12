package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SelectBookmarkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_bookmark)
        /*
        val listItems=ArrayList<Bookmark>()

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = MyAdapter(listItems)
        recyclerView.adapter = adapter
    }
    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        var numberTextView:TextView = itemView.findViewById(R.id.numberTextView)
        var startTextView:TextView = itemView.findViewById(R.id.startTextView)
        var destinationTextView:TextView = itemView.findViewById(R.id.destinationTextView)
        var costTextView:TextView = itemView.findViewById(R.id.costTextView)
        var timeTextView:TextView = itemView.findViewById(R.id.timeTextView)
    }
    class MyAdapter(var list:ArrayList<Bookmark>): RecyclerView.Adapter<MyViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            val view = inflater.inflate(R.layout.item, parent, false)
            return MyViewHolder(view)
        }

        override fun getItemCount(): Int {
            return list.size
        }

        override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
            val name = list[position]
            holder.textView.text=name
        }*/
    }
}