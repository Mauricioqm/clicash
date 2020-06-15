package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView

class cuenta : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cuenta)
        ingresarDatos()
        ingresarDatosCelular()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_drawer_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // if(toggle.onOptionsItemSelected(item)) {
        //   return true
        //}
        when(item.itemId) {
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
    }

    fun ingresarDatos() {
        val textView = findViewById(R.id.correoUsuario) as TextView
        textView?.setOnClickListener{
            val ventanaHome : Intent = Intent(applicationContext, ingresarDatos::class.java)
            startActivity(ventanaHome)
        }
    }

    fun ingresarDatosCelular() {
        val textView = findViewById(R.id.celularCuentaUsuario) as TextView
        textView?.setOnClickListener{
            val ventanaHome : Intent = Intent(applicationContext, ingresarDatosCelular()::class.java)
            startActivity(ventanaHome)
        }
    }
}
