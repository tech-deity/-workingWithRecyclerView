package com.ofw.workingwrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recycle=findViewById<RecyclerView>(R.id.recycle)
        recycle.layoutManager=LinearLayoutManager(this)
      val items =fetchData()
        val adapter:NewAdapter= NewAdapter(items)
        recycle.adapter=adapter
    }
    private fun fetchData():ArrayList<String>{
        val list=ArrayList<String>()
        for(i in 0 until 100){
            list.add("ITEM NUMBER $i")
        }
        return list
    }
}