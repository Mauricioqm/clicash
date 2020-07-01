package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.adjb.clicash.fragments.SucursalesFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(3000)
        setTheme(R.style.AppTheme)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        click_btnLogin()
        click_btnRegistro()


    }

    fun click_btnLogin() {
        btnIngresar.setOnClickListener() {
            val ventanaLogin : Intent = Intent(applicationContext, login::class.java)
            startActivity(ventanaLogin)
        }
    }

    fun click_btnRegistro() {
        btnCrear.setOnClickListener() {
            val ventanaCrear : Intent = Intent(applicationContext, registro::class.java)
            startActivity(ventanaCrear)
        }
    }

}
