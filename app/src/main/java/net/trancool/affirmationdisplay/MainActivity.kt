package net.trancool.affirmationdisplay

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import net.trancool.affirmationdisplay.adapter.ItemAdapter
import net.trancool.affirmationdisplay.data.DataSource

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet = DataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        recyclerView.adapter = ItemAdapter(this, dataSet)

//        val textView: TextView = findViewById(R.id.textview)
//        textView.text = DataSource().loadAffirmations().size.toString()//display size of the list
    }



}