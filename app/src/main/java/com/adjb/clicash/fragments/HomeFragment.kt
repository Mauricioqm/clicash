package com.adjb.clicash.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.adjb.clicash.R
import com.adjb.clicash.databinding.FragmentHomeBinding
import com.synnapps.carouselview.ImageListener
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment() {

    val imgs = intArrayOf(
        R.mipmap.slide1,
        R.mipmap.slide2,
        R.mipmap.slide3
    )


    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater)

        /*carousel_view_dos.pageCount = imgs.size
        carousel_view_dos.setImageListener{ position, imageView ->
            imageView.setImageResource(imgs[position])
        }*/

        return binding.root
    }

}
