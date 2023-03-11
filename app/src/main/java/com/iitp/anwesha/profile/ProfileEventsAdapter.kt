package com.iitp.anwesha.events

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.iitp.anwesha.databinding.MyEventDesignBinding
import com.iitp.anwesha.profile.MyEventDetails
import org.w3c.dom.Text
import java.text.SimpleDateFormat
import java.util.*

class ProfileEventsAdapter(private val eventList: List<MyEventDetails>): RecyclerView.Adapter<ProfileEventsAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(MyEventDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = eventList[position]

        holder.eventName.text = currentItem.event_name
        holder.eventStartTime.text = getTimeFromDate(currentItem.event_start_time.toString())
        holder.eventVenue.text = currentItem.event_venue
        holder.eventDate.text = getDayFromDate(currentItem.event_start_time.toString())

    }

    override fun getItemCount(): Int {
        return eventList.size
    }

    class MyViewHolder( binding: MyEventDesignBinding ):RecyclerView.ViewHolder(binding.root){

        val eventName: TextView = binding.eventName
        val eventStartTime: TextView = binding.eventTime
        val eventVenue: TextView = binding.eventLocation
        val eventDate: TextView = binding.eventDate

    }

    fun getTimeFromDate(dateTime: String): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
        dateFormat.timeZone = TimeZone.getTimeZone("UTC+5:30")
        val date = dateFormat.parse(dateTime)
        val timeFormat = SimpleDateFormat("HH:mm", Locale.getDefault())
        timeFormat.timeZone = TimeZone.getTimeZone("UTC")
        return timeFormat.format(date)
    }

    fun getDayFromDate(dateString: String): String {
        val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault())
        val date = inputFormat.parse(dateString)
        val outputFormat = SimpleDateFormat("dd MMMM", Locale.getDefault())
        return outputFormat.format(date)
    }

}