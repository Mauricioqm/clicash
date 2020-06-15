package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_correo_recuperacion.*

class correoRecuperacion : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_correo_recuperacion)
        iniciar()
    }

    fun iniciar() {
        btnIngresarHome.setOnClickListener() {
            val ventanaHome : Intent = Intent(applicationContext, login::class.java)
            startActivity(ventanaHome)
        }
    }
}
