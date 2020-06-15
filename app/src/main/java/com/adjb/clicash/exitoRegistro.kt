package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_exito_registro.*


class exitoRegistro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exito_registro)
        despues()
    }

    fun despues() {
        val textView = findViewById(R.id.irHome) as TextView
        textView?.setOnClickListener{
            val ventanaHome : Intent = Intent(applicationContext, home::class.java)
            startActivity(ventanaHome)
        }
    }
}
