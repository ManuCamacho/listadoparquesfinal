package com.example.listadoparques.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Parques
import com.example.listadoparques.R



class ParquesAdapter(val ParquesList:List<Parques>): RecyclerView.Adapter<ParquesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParquesViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return ParquesViewHolder(layoutInflater.inflate(R.layout.item_parque,parent,false))
    }

    override fun onBindViewHolder(holder: ParquesViewHolder, position: Int) {
        val item = ParquesList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
       return ParquesList.size
    }

}


