package com.college.anwesha2k23.events

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.college.anwesha2k23.databinding.FragmentEventsBinding


class EventsFragment : Fragment() {
    private var _binding: FragmentEventsBinding?= null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentEventsBinding.inflate(inflater, container, false)
        return binding.root
    }
}