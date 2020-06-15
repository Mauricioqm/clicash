package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_ingresar_datos_celular.*

class validacionIngresoTelefono : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validacion_ingreso_telefono)
        validar()
    }

    fun validar () {
        btnValidarIngresoCelular.setOnClickListener() {
            val ventanaIngresoCelular : Intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(ventanaIngresoCelular)
        }
    }
}
