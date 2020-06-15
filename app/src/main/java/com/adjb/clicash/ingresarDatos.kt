package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ingresar_datos.*
import kotlinx.android.synthetic.main.activity_ingresar_datos_celular.*

class ingresarDatos : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_datos)
        validarCorreoNuevo()
    }

    fun validarCorreoNuevo() {
        btnValidarIngresoCorreo.setOnClickListener() {
            val ventanaValidacionCorreo : Intent = Intent(applicationContext, validacionIngresoCorreo::class.java)
            startActivity(ventanaValidacionCorreo)
        }

    }
}
