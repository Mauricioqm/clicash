package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gracias.*

class gracias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gracias)
        validar()
    }

    fun validar() {
        btnContinuarGracias.setOnClickListener() {
            val ventanaValidar : Intent = Intent(applicationContext, validacion::class.java)
            startActivity(ventanaValidar)
        }
    }
}
