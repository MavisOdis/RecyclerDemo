package com.mavis.recyclerdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mavis.recyclerdemo.adapter.CountryAdapter
import com.mavis.recyclerdemo.databinding.ActivityMainBinding
import com.mavis.recyclerdemo.databinding.ActivityRecylerBinding
import com.mavis.recyclerdemo.models.Country

class RecylerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecylerBinding
    private lateinit var myCountryAapter: CountryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityRecylerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countries: List<Country> = listOf(
            Country(
                R.drawable.ic__brazil,
                name = "Brazil",
                continent = "North America",population = 12L
        ),
            Country(
                R.drawable.ic_chinese,
                name = "China",
                continent = "Asia",population = 30L
            ),
            Country(
                R.drawable.ic_u_s_a,
                name = "United States Of America",
                continent = "North America",population = 15L
            ),
            Country(
                R.drawable.ic_nigeria,
                name = "Nigeria",
                continent = "Africa",population = 10L
            ),
            Country(
                R.drawable.ic_uk,
                name = "UK",
                continent = "America",population = 34L
            )
        )
            myCountryAapter =  CountryAdapter(countries)
            binding.countryRecyclerView.adapter = myCountryAapter
    }

}