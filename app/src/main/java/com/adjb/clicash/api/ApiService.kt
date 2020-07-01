package com.adjb.clicash.api

import com.adjb.clicash.api.response.LoginResponse
import com.adjb.clicash.models.SigninResponse
import com.adjb.clicash.models.SingninRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiService {

    @POST("login")
    fun getLogin(
        @Query("username") username: String?,
        @Query("password") password: String?
    ): Call<LoginResponse?>?


    //TODO : Login User
    @POST("login")
    fun doLogin(
        @Body signinRequest: SingninRequest?
    ): Call<SigninResponse?> // body data
}