package com.example.myapplicationaaaa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object {
        val INTENT_PARCELABLE = "OBJECT_INTENTS"
    }

    private var ZooList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        ZooList = ArrayList()


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ZooAdapter(this, ZooList) {
            val intent = Intent(this, DetailZoo::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

        prepareZooListData()
    }

    private fun prepareZooListData() {
        var zoo = DataModel(
            R.drawable.ayam1,
            "AYAM KECAP",
            ""
        )
        ZooList.add(zoo)

        zoo = DataModel(
            R.drawable.ayam2,
            "AYAM BALADO",
            ""
        )
        ZooList.add(zoo)

        zoo = DataModel(
            R.drawable.ayam3,
            "AYAM BAKAR",
            ""
        )
        ZooList.add(zoo)

        zoo = DataModel(
            R.drawable.ayam4,
            "AYAM BUMBU KUNING",
            ""
        )
        ZooList.add(zoo)

        zoo = DataModel(
            R.drawable.ayam5,
            "AYAM PENYET",
            ""
        )

        ZooList.add(zoo)
    }
}