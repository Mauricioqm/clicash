package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_password.*

class password : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_password)
        recuperar()
    }

    fun recuperar() {
        btnRecPassword.setOnClickListener() {
            val ventanaLogin : Intent = Intent(applicationContext, correoRecuperacion::class.java)
            startActivity((ventanaLogin))
        }
    }
}
