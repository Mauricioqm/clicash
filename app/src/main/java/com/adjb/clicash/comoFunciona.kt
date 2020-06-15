package com.adjb.clicash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_como_funciona.*

class comoFunciona : AppCompatActivity() {

    val imgs = intArrayOf(
        R.mipmap.paso1,
        R.mipmap.paso2,
        R.mipmap.paso3
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_como_funciona)

        carousel_view.pageCount = imgs.size
        carousel_view.setImageListener{ position, imageView ->
            imageView.setImageResource(imgs[position])
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.nav_drawer_menu, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // if(toggle.onOptionsItemSelected(item)) {
        //   return true
        //}
        when(item.itemId) {
            R.id.comofunciona -> {
                startActivity(Intent(this, comoFunciona::class.java))
                return true
            }

            R.id.drawerLayout -> {
                startActivity(Intent(this, home::class.java))
                return true
            }

            R.id.micuenta -> {
                startActivity(Intent(this, cuenta::class.java))
                return true
            }

            R.id.mistarjetas -> {
                startActivity(Intent(this, misTarjetas::class.java))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
