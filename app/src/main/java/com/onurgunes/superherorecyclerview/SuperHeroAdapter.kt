package com.onurgunes.superherorecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.onurgunes.superherorecyclerview.databinding.RecyclerRowBinding
import java.util.ArrayList

class SuperHeroAdapter(val superHeroList : ArrayList<superhero>) : RecyclerView.Adapter<SuperHeroAdapter.heroHolder>() {
    class heroHolder(val binding: RecyclerRowBinding) : RecyclerView.ViewHolder(binding.root){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): heroHolder {
       val  binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return heroHolder(binding)

    }

    override fun getItemCount(): Int {
 return superHeroList.size
    }

    override fun onBindViewHolder(holder: heroHolder, position: Int) {
holder.binding.recyclerViewText.text = superHeroList[position].name
    }
}