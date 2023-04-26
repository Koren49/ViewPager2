package com.example.viewpager2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewpager2.adapters.ViewPagerAdapter
import com.example.viewpager2.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val adapter = ViewPagerAdapter(supportFragmentManager, lifecycle)
        binding.viewPager2.adapter = adapter

        TabLayoutMediator(binding.tabLayout, binding.viewPager2){ tab, position->
            when(position){
                0 -> {
                    tab.text = "First"
                }
                1 -> {
                    tab.text = "Second"
                }
                2 -> {
                    tab.text = "Third"
                }
            }
        }.attach()

    }
}