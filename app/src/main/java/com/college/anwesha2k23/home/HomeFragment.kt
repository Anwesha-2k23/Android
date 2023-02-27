package com.college.anwesha2k23.home

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.airbnb.lottie.LottieDrawable
import com.college.anwesha2k23.R
import com.college.anwesha2k23.databinding.FragmentHomeBinding
import com.college.anwesha2k23.events.*
import com.college.anwesha2k23.home.functions.nav_items_functions
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.navigation.NavigationView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class HomeFragment : Fragment() {
    private lateinit var binding : FragmentHomeBinding
    private lateinit var eventViewModel: EventsViewModel
    private lateinit var newEventView : RecyclerView
    private lateinit var newEventList : ArrayList<EventList>
    private lateinit var drawerLayout: DrawerLayout
    private lateinit var actionBarToggle: ActionBarDrawerToggle
    private lateinit var adap: EventAdapter
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
        behavior.peekHeight = 1000
        behavior.state = BottomSheetBehavior.STATE_COLLAPSED


        nav_items_functions(binding, requireActivity()).selectingItems()
        eventViewModel= ViewModelProvider(this)[EventsViewModel::class.java]
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //preparing the recycler view
        newEventView = binding.eventsList
        val serviceGenerator = EventsApiService.buildService(EventsApi::class.java)
        val call = serviceGenerator.getEvents()

        call.enqueue(object : Callback<MutableList<EventList>>{
            override fun onResponse(
                call: Call<MutableList<EventList>>,
                response: Response<MutableList<EventList>>
            ) {
                newEventView.apply {
                    layoutManager = LinearLayoutManager(context)
                    adap = EventAdapter(response.body()!! as ArrayList<EventList>, context)
                    adapter = adap
                    adap.setOnItemClickListener(object : EventAdapter.OnItemClickListener{
                        override fun onItemClicked(event: EventList) {          //when any event from the recycler view is clicked
                            loadSingleEventFragment(event)
                        }

                    })
                }
//                Toast.makeText(context, "Api Called", Toast.LENGTH_SHORT).show()
            }

            override fun onFailure(call: Call<MutableList<EventList>>, t: Throwable) {
                Toast.makeText(context, "$t", Toast.LENGTH_SHORT).show()
            }

        }

        )
        setAnime()

        binding.dayOne.setOnClickListener{
            Toast.makeText(context, "Day 1 is clicked", Toast.LENGTH_SHORT).show()
            //On click it will refresh the recycler view and show the list of event happening on that day
        }
        binding.dayTwo.setOnClickListener{
            Toast.makeText(context, "Day 2 is clicked", Toast.LENGTH_SHORT).show()
        }
        binding.dayThree.setOnClickListener{
            Toast.makeText(context, "Day 3 is clicked", Toast.LENGTH_SHORT).show()
        }
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
    
    private fun loadSingleEventFragment(event: EventList){
        val bundle = Bundle()
        bundle.putString("eventName", event.name)
        val fragment = SingleEventFragment()
        fragment.arguments = bundle
        val fragmentTransaction = activity?.supportFragmentManager!!.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentContainer, fragment)
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun setAnime() {
        binding.animationView.setAnimation(R.raw.map_replace)
        binding.animationView.repeatCount = LottieDrawable.INFINITE
        binding.animationView.playAnimation()
    }
}