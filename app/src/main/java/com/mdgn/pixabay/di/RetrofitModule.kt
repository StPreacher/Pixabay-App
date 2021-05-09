package com.mdgn.pixabay.di

import com.mdgn.pixabay.network.Api
import com.mdgn.pixabay.util.Constant
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    @Singleton
    @Provides
    fun provideRetrofit() : Retrofit = Retrofit
        .Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(Constant.BASE_URL)
        .build()

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit) : Api = retrofit.create(Api::class.java)


}