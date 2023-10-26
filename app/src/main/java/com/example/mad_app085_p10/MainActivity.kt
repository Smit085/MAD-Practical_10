package com.example.mad_app085_p10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mad_app085_p10.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    var arr_records = ArrayList<LocationlistCardModel>()
    private fun getPersonDetailsFromJson(data: String) {

    }

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


        val adapter = RecyclerPersonlistAdapter(this, arr_records)
        binding.recyclerview.layoutManager = LinearLayoutManager(this)
        binding.recyclerview.adapter = adapter

        CoroutineScope(Dispatchers.IO).launch {
            try {
                val data = HttpRequest().makeServiceCall(,)
                withContext(Dispatchers.Main) {
                    try {
                        if(data != null)
                        runOnUiThread{getPersonDetailsFromJson(data)}
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
    }
}