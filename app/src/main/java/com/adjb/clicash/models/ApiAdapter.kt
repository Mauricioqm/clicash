package com.adjb.clicash.models

import android.app.Activity
import com.adjb.clicash.api.ApiService
import com.adjb.clicash.api.ApiWorker
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


class ApiAdapter {

    private var API_SERVICE: ApiService? = null
    private val TAG = "--ApiService"
    private val BASE_URL = "https://admin.clicash.com/rewardswsdev/"

    fun getApiService(): ApiService? {

        // Creamos un interceptor y le indicamos el log level a usar
        val logging = HttpLoggingInterceptor()
        logging.level = HttpLoggingInterceptor.Level.BODY

        // Asociamos el interceptor a las peticiones
        val httpClient = OkHttpClient.Builder()
        httpClient.addInterceptor(logging)
        val baseUrl = "https://admin.clicash.com/rewardswsdev/"
        if (API_SERVICE == null) {
            val retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .client(httpClient.build()) // <-- usamos el log level
                .build()
            API_SERVICE = retrofit.create<ApiService>(ApiService::class.java)
        }
        return API_SERVICE
    }

    fun loginApiCall() = Retrofit.Builder()
        .baseUrl(BASE_URL)
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(ApiWorker.gsonConverter)
        .client(ApiWorker.client)
        .build()
        .create(ApiService::class.java)!!

}