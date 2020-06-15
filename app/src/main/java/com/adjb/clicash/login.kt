package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login()
        recuperar()
    }

    fun login () {
        btnLogin.setOnClickListener() {
            val ventabaHome : Intent = Intent(applicationContext, home::class.java)
            startActivity(ventabaHome)
        }
    }

    fun recuperar() {
        val textView = findViewById(R.id.recuperar) as TextView
        textView?.setOnClickListener{
            val ventanaHome : Intent = Intent(applicationContext, password::class.java)
            startActivity(ventanaHome)
        }

    }
}
