package com.example.vit_intern

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        var listview : ListView = findViewById(R.id.ListView)
        val listItems = arrayOf("Read a book",
            "create a project",
            "Walk",
            "Go to the market",
            "Do household chores"
        )
        val listadapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,listItems)
        listview.adapter = listadapter

        listview.setOnItemClickListener{parent,view,position,id->
            val selectedItem = parent.getItemAtPosition(position) as String
            Toast.makeText(this,"you have clicked on: $selectedItem",Toast.LENGTH_SHORT).show()
        }
    }

//    override fun onStart() {
//        super.onStart()
//        Log.i("MainActivity","the activity has started")
//    }
//
//    override fun onPause() {
//        super.onPause()
//        Log.e("MainActivity","the activity is paused")
//    }
//
//    override fun onResume() {
//        super.onResume()
//        Log.i("MainActivity","The function has resumed")
//    }
//
//    override fun onDestroy() {
//        super.onDestroy()
//        Log.w("MainActivity","The function has destroyed")
//    }
//
//    fun clickHandler(view: View) {
//
//        Log.i("MainActivity", "clickHandler: button clicked ")
//        var dialIntent: Intent= Intent(Intent.ACTION_DIAL, Uri.parse("tel:9876543210"))
//        startActivity(dialIntent)
//    }


}