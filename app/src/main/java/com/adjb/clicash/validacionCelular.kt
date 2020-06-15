package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_validacion_celular.*

class validacionCelular : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validacion_celular)
        validarCelular()
    }

    fun validarCelular() {
        btnValidarCelular.setOnClickListener() {
            val ventanaExito : Intent = Intent(applicationContext, exitoRegistro::class.java)
            startActivity(ventanaExito)
        }
    }
}
