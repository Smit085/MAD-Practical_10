package com.example.mad_app085_p10

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mad_app085_p10.databinding.ActivityMainBinding
import java.io.Serializable

class RecyclerPersonlistAdapter: RecyclerView.Adapter<RecyclerPersonlistAdapter.ViewHolder> {
    private var context: Context
    private var arr_records = ArrayList<LocationlistCardModel>()
    constructor(context: Context, arr_records: ArrayList<LocationlistCardModel>){
        this.context = context
        this.arr_records = arr_records
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txt_name: TextView = itemView.findViewById(R.id.txt_name)
        val txt_email: TextView = itemView.findViewById(R.id.txt_email)
        val txt_mobno: TextView = itemView.findViewById(R.id.txt_mobno)
        val txt_address: TextView = itemView.findViewById(R.id.txt_address)
        val btn_map: Button = itemView.findViewById(R.id.btn_map)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_locationlist, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.txt_name.text = arr_records[position].name
        holder.txt_email.text = arr_records[position].email
        holder.txt_mobno.text = arr_records[position].mobno
        holder.txt_address.text = arr_records[position].address

        val obj = this as Serializable
        holder.btn_map.setOnClickListener {
            Intent (this@RecyclerPersonlistAdapter.context, MapsActivity::class.java).apply {
                putExtra("object",obj)
                this@RecyclerPersonlistAdapter.context.startActivity( this)
            }
        }
    }

    override fun getItemCount(): Int {
        return arr_records.size
    }
}
