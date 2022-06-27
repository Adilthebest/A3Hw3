package com.example.w.network

import retrofit2.http.GET
import retrofit2.http.Query

interface PixabayApi {
    @GET("/api/")
    fun getImageByWorld
                (@Query("key") key:String="28273167-f1d30e392dc0e1c7eb28811fd",
                 @Query("q") keyWorld :String,
                 @Query("page") page: Int,
                 @Query("per_page") per_page: Int
    ):retrofit2.Call<PixabayModel>
}