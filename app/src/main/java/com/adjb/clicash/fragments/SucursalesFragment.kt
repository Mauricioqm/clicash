package com.adjb.clicash.fragments



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.adjb.clicash.R
import com.adjb.clicash.databinding.FragmentSucursalesBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import kotlinx.android.synthetic.main.fragment_cupones.*
import kotlinx.android.synthetic.main.fragment_sucursales.*
import kotlinx.android.synthetic.main.fragment_sucursales.view.*

/**
 * A simple [Fragment] subclass.
 */
class SucursalesFragment : Fragment(), OnMapReadyCallback {

    private lateinit var googleMap: GoogleMap //Traer librerias de mapa

    lateinit var binding: FragmentSucursalesBinding
    private lateinit var mTextView: TextView
    


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        map_view.onCreate(savedInstanceState)
        map_view.onResume()

        map_view.getMapAsync(this)
    }

    override fun onMapReady(map: GoogleMap?) {
        map?.let {
            googleMap = it
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // binding = FragmentSucursalesBinding.inflate(inflater)
        val view: View = inflater.inflate(R.layout.fragment_sucursales, container, false)

        /*view.btnMapa.setOnClickListener {view ->
            //Toast.makeText(getActivity(),"Toast Hello",Toast.LENGTH_LONG).show();
            //val intent = Intent(activity, mapaFragment::class.java)
            //startActivity(intent)
            //requireActivity().supportFragmentManager.beginTransaction()
              //  .replace(R.id.frag_sucursales, mapaFragment.newInstance())
                //.commit()
        }*/
        /*view.btnMapa?.setOnClickListener{
            view -> Navigation.findNavController(view).navigate(R.id.text_mapa)
        }*/

        return view

        /*btnMapa.setOnClickListener() {
            Toast.makeText(getActivity(),"Toast Hello",Toast.LENGTH_LONG).show();
        }*/

    }



}
