package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.constraintlayout.widget.Placeholder
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import com.adjb.clicash.fragments.mapaFragment
import kotlinx.android.synthetic.main.activity_cuenta.*
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_sucursales.*

class home : AppCompatActivity() {

    lateinit var appBarConfiguration: AppBarConfiguration
    lateinit var navController: NavController
    lateinit var toggle: ActionBarDrawerToggle


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()


        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.comofunciona -> {
                    startActivity(Intent(this, comoFunciona::class.java))

                }

                R.id.drawerLayout -> {
                    startActivity(Intent(this, home::class.java))

                }

                R.id.micuenta -> {
                    startActivity(Intent(this, cuenta::class.java))

                }

                R.id.mistarjetas -> {
                    startActivity(Intent(this, misTarjetas::class.java))

                }
            }
            true
        }



        // Bottom
        navController = findNavController(R.id.hostFragment)
        bottom_navigation.setupWithNavController(navController)




    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_drawer_menu, menu)
        return true
    }


    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when (item.itemId) {
                R.id.comofunciona -> {
                    startActivity(Intent(this, comoFunciona::class.java))
                    return true
                }

                R.id.drawerLayout -> {
                    startActivity(Intent(this, home::class.java))
                    return true
                }

                R.id.micuenta -> {
                    startActivity(Intent(this, cuenta::class.java))
                    return true
                }

                R.id.mistarjetas -> {
                    startActivity(Intent(this, misTarjetas::class.java))
                    return true
                }
            }

            return super.onOptionsItemSelected(item)


    }]*/

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toggle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }



    override fun onSupportNavigateUp(): Boolean {
       return NavigationUI.navigateUp(navController, appBarConfiguration)
    }


}
