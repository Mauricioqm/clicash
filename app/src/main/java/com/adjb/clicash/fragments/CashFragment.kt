package com.adjb.clicash.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.adjb.clicash.R
import com.adjb.clicash.databinding.FragmentCashBinding

/**
 * A simple [Fragment] subclass.
 */
class CashFragment : Fragment() {

    lateinit var binding: FragmentCashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCashBinding.inflate(inflater)
        return binding.root
    }

}
