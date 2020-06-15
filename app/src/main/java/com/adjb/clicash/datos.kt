package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_datos.*

class datos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datos)
        registrarDatos()
    }

    fun registrarDatos() {
        btnContinuarDatos.setOnClickListener() {
            val ventanaCuenta : Intent = Intent(applicationContext, gracias::class.java)
            startActivity(ventanaCuenta)
        }
    }
}
