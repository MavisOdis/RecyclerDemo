package com.mavis.recyclerdemo.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mavis.recyclerdemo.databinding.ActivityRecylerBinding
import com.mavis.recyclerdemo.databinding.CountryItemBinding
import com.mavis.recyclerdemo.models.Country


class CountryAdapter(val countries: List<Country>)
    : RecyclerView.Adapter<CountryAdapter.CountryViewHolder>() {
    class CountryViewHolder(var binding: CountryItemBinding)
        :RecyclerView.ViewHolder(binding.root){

        fun bind(country: Country){
            binding.apply {
                continentView.text = country.continent
                countryname.text = country.name
                poulationView.text = country.population.toString()
                flag.setImageResource(country.flag)
            }
        }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryViewHolder {
        var binding = CountryItemBinding.inflate(LayoutInflater.from(parent.context))
        return CountryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CountryViewHolder, position: Int) {
        val country = countries[position]
        holder.bind(country)
    }

    override fun getItemCount(): Int {
        return countries.size
    }
}