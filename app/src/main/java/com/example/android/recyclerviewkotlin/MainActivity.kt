package com.example.android.recyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.rv_name)
        recyclerView.layoutManager = LinearLayoutManager(
                this,
                LinearLayout.VERTICAL,
                false
        )

        val users = ArrayList<User>()
        users.add(User("Arif Ikhsanudin", "Magelang, Indonesia"))
        users.add(User("Arif Ikhsanudin 2", "Magelang, Indonesia"))
        users.add(User("Arif Ikhsanudin 3", "Magelang, Indonesia"))
        users.add(User("Arif Ikhsanudin 4", "Magelang, Indonesia"))
        users.add(User("Arif Ikhsanudin 5", "Magelang, Indonesia"))
        users.add(User("Arif Ikhsanudin 6", "Magelang, Indonesia"))

        val adapter = CustomAdapter(users)

        recyclerView.adapter = adapter
    }
}
