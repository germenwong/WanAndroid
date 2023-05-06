package com.hgm.wanandroid.data.http

import retrofit2.http.POST
import retrofit2.http.Query

interface MyApi {


    @POST("user/login")
    suspend fun login(@Query("username") username: String, password: String)
}