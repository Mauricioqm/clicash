package com.adjb.clicash.models

import com.google.gson.annotations.SerializedName

class SignupRequest (@SerializedName("username") var username: String,
                     @SerializedName("password") var password: String)