package com.mdgn.pixabay.network

import com.mdgn.pixabay.model.PictureResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("api/")
    suspend fun getPicture(
        @Query("key") apiKey : String,
        @Query("q") query: String?
    ) : Response<PictureResponse>

}