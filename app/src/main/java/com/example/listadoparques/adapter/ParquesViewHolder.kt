package com.example.listadoparques.adapter

import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Parques
import com.example.listadoparques.databinding.ItemParqueBinding

class ParquesViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding = ItemParqueBinding.bind(view)
    fun render(parqueModel:Parques){
        binding.Title.text= parqueModel.titulo
        binding.Description.text=parqueModel.descripcion
        Glide.with(binding.Imagen.context).load(parqueModel.imagen).into(binding.Imagen)

        binding.Imagen.setOnClickListener{Toast.makeText(binding.Imagen.context,parqueModel.titulo,Toast.LENGTH_LONG).show()}
        itemView.setOnClickListener{Toast.makeText(binding.Imagen.context,parqueModel.titulo,Toast.LENGTH_LONG).show()}
    }
}