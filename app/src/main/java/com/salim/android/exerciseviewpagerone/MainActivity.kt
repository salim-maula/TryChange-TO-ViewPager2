package com.salim.android.exerciseviewpagerone

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.salim.android.exerciseviewpagerone.controler.PagerAdapter
import com.salim.android.exerciseviewpagerone.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewPager.adapter = PagerAdapter(supportFragmentManager)

//        binding.tabLayoutId.setupWithViewPager(binding.viewPager)
//
//        binding.tabLayoutId.setTabTextColors(Color.GRAY, (Color.parseColor("White")))

        binding.tabLayoutId.apply {
            setupWithViewPager(binding.viewPager)
            setTabTextColors(Color.GRAY, (Color.parseColor("White")))
        }

    }
}