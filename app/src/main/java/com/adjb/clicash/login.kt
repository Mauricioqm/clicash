package com.adjb.clicash

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatTextView
import com.adjb.clicash.api.ApiWorker
import com.adjb.clicash.models.ApiAdapter
import com.adjb.clicash.models.SigninResponse
import com.adjb.clicash.models.SingninRequest
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.activity_login.*
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class login : AppCompatActivity(), View.OnClickListener {
    //var emailLogin: EditText? = null
    //var contrasenaLogin:EditText? = null

    private var usernameLogin : TextInputEditText? = null
    //private lateinit var contrasenaLogin : TextInputEditText
    private var contrasenaLogin: TextInputEditText? = null
    private lateinit var btn_signin : MaterialButton
    private lateinit var txt_sign_up : AppCompatTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        login()
        recuperar()

        //ed_email = findViewById(R.id.ed_email) as TextInputEditText
        //ed_password = findViewById(R.id.ed_password) as TextInputEditText
        //btn_signin = findViewById(R.id.btnLogin) as MaterialButton
        //txt_sign_up = findViewById(R.id.txt_sign_up) as AppCompatTextView

        btnLogin.setOnClickListener(this)
        //txt_sign_up.setOnClickListener(this)


    }

    fun login () {
        btnLogin.setOnClickListener() {
            val ventabaHome : Intent = Intent(applicationContext, home::class.java)
            startActivity(ventabaHome)
        }
    }

    fun recuperar() {
        val textView = findViewById(R.id.recuperarCuenta) as TextView
        textView?.setOnClickListener{
            val ventanaHome : Intent = Intent(applicationContext, password::class.java)
            startActivity(ventanaHome)
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            /*R.id.txt_sign_up -> {
                startActivity(Intent(this@LoginActivity, RegisterActivity::class.java))
            }*/
            R.id.btnLogin -> {
                if (validation()) {
                    val json = JSONObject()
                    json.put("username", usernameLogin.toString())
                    json.put("password", contrasenaLogin.toString())



                    com.adjb.clicash.api.response.ApiAdapter.loginApiCall().doLogin(
                        SingninRequest(
                            usernameLogin.toString(),contrasenaLogin.toString()
                        )
                    ).enqueue(object : Callback<SigninResponse?> {
                        override fun onResponse(
                            call: Call<SigninResponse?>,
                            response: Response<SigninResponse?>
                        ) {

                            Log.d("Response::::", response.body().toString())
                            if (response.body()!!.status){
                                finish()
                                val intent = Intent(applicationContext, home::class.java)
                                intent.putExtra("id",response.body()!!.data.id)
                                startActivity(intent)
                            }else{
                                Toast.makeText(applicationContext, response.body()!!.message, Toast.LENGTH_LONG).show()
                            }
                        }

                        override fun onFailure(call: Call<SigninResponse?>, t: Throwable) {
                        }

                    })


                }
            }
        }
    }

    fun validation(): Boolean {
        var value = true

        val password = contrasenaLogin.toString().trim()
        val name = usernameLogin.toString().trim()

        /*if (password.isEmpty()) {
            contrasenaLogin.error = "Password required"
            contrasenaLogin.requestFocus()
            value = false
        }*/

        /*if (name.isEmpty()) {
            usernameLogin.error = "Username required"
            usernameLogin.requestFocus()
            value = false
        }*/

        return value;
    }
}
