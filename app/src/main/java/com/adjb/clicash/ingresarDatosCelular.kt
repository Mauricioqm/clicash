package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ingresar_datos_celular.*

class ingresarDatosCelular : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ingresar_datos_celular)
        validar()
    }

    fun validar () {
        btnValidarIngresoCelular.setOnClickListener() {
            val ventanaValidacionTelefono : Intent = Intent(applicationContext, validacionIngresoTelefono::class.java)
            startActivity(ventanaValidacionTelefono)
        }
    }
}
