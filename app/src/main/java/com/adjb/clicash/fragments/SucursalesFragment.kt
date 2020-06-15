package com.adjb.clicash.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast

import com.adjb.clicash.R
import com.adjb.clicash.databinding.FragmentSucursalesBinding
import com.adjb.clicash.home
import kotlinx.android.synthetic.main.fragment_sucursales.*

/**
 * A simple [Fragment] subclass.
 */
class SucursalesFragment : Fragment() {

    private var ctx: Context? = null
    private var self: View? = null

    lateinit var binding: FragmentSucursalesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSucursalesBinding.inflate(inflater)

        ctx = container?.context
        self = LayoutInflater.from(ctx).inflate(R.layout.fragment_sucursales, container, false)
        val bDaButton = self?.findViewById<Button>(R.id.btnVermapa)
        bDaButton?.setOnClickListener {
            Toast.makeText(ctx, "button works!", Toast.LENGTH_SHORT).show()
        }
        return binding.root

        /*btnVermapa.setOnClickListener() {
            val ventanaMapa = Intent(activity, home::class.java)
            startActivity(ventanaMapa)
        }*/


    }

}
