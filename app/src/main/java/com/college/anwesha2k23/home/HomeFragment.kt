package com.college.anwesha2k23.home

import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieDrawable
import com.college.anwesha2k23.LoginActivity
import com.college.anwesha2k23.R
import com.college.anwesha2k23.campusAmbassador.CaActivity
import com.college.anwesha2k23.databinding.FragmentHomeBinding
import com.college.anwesha2k23.events.EventAdapter
import com.college.anwesha2k23.events.EventList
import com.college.anwesha2k23.home.functions.get_events
import com.college.anwesha2k23.home.functions.nav_items_functions
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.navigation.NavigationView


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    private lateinit var adapter: EventAdapter
    private lateinit var newEventView : RecyclerView
    private lateinit var newEventList : ArrayList<EventList>
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarToggle: ActionBarDrawerToggle
    private lateinit var navView: NavigationView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)


        newEventList = arrayListOf()
        drawerLayout = binding.frameLayout
        actionBarToggle = ActionBarDrawerToggle(activity, drawerLayout, 0, 0)
        drawerLayout.addDrawerListener(actionBarToggle)
        actionBarToggle.syncState()

        binding.navBar.setOnClickListener {
            drawerLayout.openDrawer(Gravity.LEFT)
        }

        val bottomSheet = binding.eventBottomSheet
        val behavior = BottomSheetBehavior.from(bottomSheet)
        behavior.peekHeight = 400
        behavior.state = BottomSheetBehavior.STATE_COLLAPSED

        nav_items_functions(binding, requireActivity()).selectingItems()

        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        get_events(binding, requireActivity()).getUserData(newEventList)
        val layoutManager = LinearLayoutManager(context)
        newEventView = binding.eventsList
        newEventView.layoutManager = layoutManager
        newEventView.setHasFixedSize(true)
        adapter = EventAdapter(newEventList)
        newEventView.adapter = adapter

        setAnime()
    }

    fun onSupportNavigateUp(): Boolean {
        drawerLayout.openDrawer(navView)
        return true
    }

    // override the onBackPressed() function to close the Drawer when the back button is clicked
    fun onBackPressed() {
        if (this.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            this.drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            requireActivity().onBackPressed()
        }
    }

    fun setAnime() {
        binding.animationView.setAnimation(R.raw.map_replace)
        binding.animationView.repeatCount = LottieDrawable.INFINITE
        binding.animationView.playAnimation()
    }
}