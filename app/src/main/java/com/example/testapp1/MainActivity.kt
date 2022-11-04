package com.example.testapp1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var lista: ArrayList<ArrayList<String>> = ArrayList<ArrayList<String>>()
        lista.add(arrayListOf("1","Jan","Kowalski"))
        lista.add(arrayListOf("2","Pawel","Nowak"))
        lista.add(arrayListOf("3","Piotr","Sliwicki"))

        var url = ""

        var recycler: RecyclerView = this.findViewById<RecyclerView>(R.id.recycler)
        recycler.adapter = Adapter(lista)
    }
}