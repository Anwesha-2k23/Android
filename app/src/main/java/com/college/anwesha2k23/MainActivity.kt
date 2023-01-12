package com.college.anwesha2k23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.college.anwesha2k23.R.*
import com.college.anwesha2k23.databinding.ActivityMainBinding
import com.college.anwesha2k23.events.EventsFragment
import com.college.anwesha2k23.home.HomeFragment
import com.college.anwesha2k23.profile.ProfileFragment

import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private  lateinit var bottomNav: BottomNavigationView
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide() //Hide App title

        loadFragment(HomeFragment())

        bottomNav = binding.bottomNavigation
        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                id.home -> {
                    loadFragment(HomeFragment())
                    true
                }
                id.profile -> {
                    loadFragment(ProfileFragment())
                    true
                }
                id.event -> {
                    loadFragment(EventsFragment())
                    true
                }
                else->{
                    loadFragment(HomeFragment())
                    true
                }
            }
        }
    }
    private fun loadFragment(fragment: Fragment){
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(id.fragmentContainer, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}