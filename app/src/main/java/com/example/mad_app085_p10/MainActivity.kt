package com.example.mad_app085_p10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mad_app085_p10.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var arr_records = ArrayList<LocationlistCardModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        arr_records.add(LocationlistCardModel("Patel Smit","+91 87657 87678","smit@gnu.ac.in","Suryadeep Residency Nikol Naroda Road Ahmedabad-382350"))
        arr_records.add(LocationlistCardModel("Patel Smit","+91 87657 87678","smit@gnu.ac.in","Suryadeep Residency Nikol Naroda Road Ahmedabad-382350"))
        arr_records.add(LocationlistCardModel("Patel Smit","+91 87657 87678","smit@gnu.ac.in","Suryadeep Residency Nikol Naroda Road Ahmedabad-382350"))
        arr_records.add(LocationlistCardModel("Patel Smit","+91 87657 87678","smit@gnu.ac.in","Suryadeep Residency Nikol Naroda Road Ahmedabad-382350"))
        arr_records.add(LocationlistCardModel("Patel Smit","+91 87657 87678","smit@gnu.ac.in","Suryadeep Residency Nikol Naroda Road Ahmedabad-382350"))
        arr_records.add(LocationlistCardModel("Patel Smit","+91 87657 87678","smit@gnu.ac.in","Suryadeep Residency Nikol Naroda Road Ahmedabad-382350"))
        arr_records.add(LocationlistCardModel("Patel Smit","+91 87657 87678","smit@gnu.ac.in","Suryadeep Residency Nikol Naroda Road Ahmedabad-382350"))
        arr_records.add(LocationlistCardModel("Patel Smit","+91 87657 87678","smit@gnu.ac.in","Suryadeep Residency Nikol Naroda Road Ahmedabad-382350"))



        val adapter = RecyclerLocationlistAdapter(this, arr_records)

        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = adapter
    }
}