package com.adjb.clicash.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.adjb.clicash.R
import com.adjb.clicash.databinding.FragmentCuponesBinding

/**
 * A simple [Fragment] subclass.
 */
class CuponesFragment : Fragment() {

    lateinit var binding: FragmentCuponesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCuponesBinding.inflate(inflater)
        return binding.root
    }

}
