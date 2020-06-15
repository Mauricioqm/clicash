package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_validacion.*

class validacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_validacion)
        validar()
    }

    fun validar() {
        btnValidarCorreo.setOnClickListener() {
            val ventanaCelular : Intent = Intent(applicationContext, validacionCelular::class.java)
            startActivity(ventanaCelular)
        }
    }
}
