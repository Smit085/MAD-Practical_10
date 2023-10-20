package com.example.mad_app085_p10

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerLocationlistAdapter: RecyclerView.Adapter<RecyclerLocationlistAdapter.ViewHolder> {
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
    }

    override fun getItemCount(): Int {
        return arr_records.size
    }
}
