package com.adjb.clicash.api.response

import com.adjb.clicash.api.ApiService
import com.adjb.clicash.api.ApiWorker
import retrofit2.Retrofit

object ApiAdapter {
    private val TAG = "--ApiService"
    private val BASE_URL = "https://admin.clicash.com/rewardswsdev/"

    fun loginApiCall() = Retrofit.Builder()
        .baseUrl(BASE_URL)
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(ApiWorker.gsonConverter)
        .client(ApiWorker.client)
        .build()
        .create(ApiService::class.java)!!
}