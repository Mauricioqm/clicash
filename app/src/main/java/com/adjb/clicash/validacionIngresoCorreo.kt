package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ingresar_datos.*

class validacionIngresoCorreo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validacion_ingreso_correo)
        validar()
    }

    fun validar() {
        btnValidarIngresoCorreo.setOnClickListener() {
            val ventanaValidarIngresoCorreo : Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(ventanaValidarIngresoCorreo)
        }
    }
}
