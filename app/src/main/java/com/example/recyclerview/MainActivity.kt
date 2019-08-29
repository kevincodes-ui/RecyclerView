package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Adapter
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var recycleViewList: ArrayList<RcvModel>? = null
    private var adapter: RecyclerAdapter? = null
    private val avatar = intArrayOf(
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img,
        R.drawable.abaac_first_img)
    private val title = arrayOf("Benz", "Bike", "Car", "Carrera", "Ferrari", "Harly", "Lamborghini", "Silver")
    private val message = arrayOf("Hello there,what's up?",
        "Coucou",
        "I miss you, ou know...",
        "When you coming, to Boston?", "100K USD bro", "Really!!!", "Let's go race!!!", "Lmfaoo!!")
    private val sentAt = arrayOf("10:34 AM", "1035 AM", "11:06 AM", "11:24 AM", "11:27 AM","11:45 AM"," 12:00 PM"," 12:46 PM")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialize()
    }

    fun initialize(){
        recyclerView = findViewById(R.id.recyclerView) as RecyclerView

        recycleViewList = populateList()
        Log.d("RecycleView List: ", recycleViewList!!.size.toString() + "")
        adapter = RecyclerAdapter( recycleViewList!!)
        recyclerView!!.adapter = adapter
        recyclerView!!.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
    }

    private fun populateList(): ArrayList<RcvModel> {

        val list = ArrayList<RcvModel>()

        for (i in 0..7) {
            val rcvModel = RcvModel()
            rcvModel.setTitles(title[i])
            rcvModel.setMessages(message[i])
            rcvModel.setSentAts(sentAt[i])
            list.add(rcvModel)
        }

        return list
    }
}
