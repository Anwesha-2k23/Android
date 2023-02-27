package com.college.anwesha2k23.home

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.college.anwesha2k23.databinding.EventDesignBinding

class EventAdapter(private val eventList: ArrayList<EventList>, private val context: Context): RecyclerView.Adapter<EventAdapter.MyViewHolder>(){

    private lateinit var listener: OnItemClickListener

    //Interface that will tell what happens when a event is clicked
    interface OnItemClickListener{
        fun onItemClicked(event: EventList)
    }

    fun setOnItemClickListener(mListener: OnItemClickListener){
        listener = mListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(EventDesignBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = eventList[position]
        val animation = AnimationUtils.loadAnimation(holder.itemView.context, android.R.anim.slide_in_left)
        Glide.with(context)
            .load(currentItem.poster)
            .into(holder.eventPoster)
        holder.eventName.text = currentItem.name
        holder.eventLocation.text = currentItem.venue
        holder.eventDate.text = currentItem.start_time
        holder.eventTime.text = currentItem.end_time
        holder.itemView.startAnimation(animation)
        holder.itemView.setOnClickListener{
            listener.onItemClicked(currentItem)
        }
    }

    override fun getItemCount(): Int {
        return eventList.size
    }

    class MyViewHolder( binding: EventDesignBinding ):RecyclerView.ViewHolder(binding.root){
        val eventPoster : ImageView = binding.eventPoster
        val eventName : TextView = binding.eventName
        val eventLocation: TextView = binding.eventLocation
        val eventDate: TextView = binding.eventDate
        val eventTime: TextView = binding.eventTime
    }

}