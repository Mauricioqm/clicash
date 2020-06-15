package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_registro.*

class registro : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        check()
        registro()
    }

    fun check() {
        if(checkInput.isChecked) {
            btnContinuar.setEnabled(false);
        }
    }

    fun registro() {
        btnContinuar.setOnClickListener() {
            val ventanaDatos :  Intent = Intent(applicationContext, datos::class.java)
            startActivity(ventanaDatos)
        }
    }
}
