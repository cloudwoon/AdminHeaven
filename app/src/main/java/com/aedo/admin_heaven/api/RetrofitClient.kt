package com.aedo.admin_heaven.api

import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


object RetrofitClient {
    private var retrofit : Retrofit? = null
    private var okhttp: OkHttpClient? = null
    var gson = GsonBuilder().setLenient().create()

  /*  init { //로그 설정
        val interceptor = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
        okhttp = OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
    }*/


    fun getClient(baseUrl: String): Retrofit {
        if (retrofit ==  null) {
            retrofit = Retrofit.Builder()
                .baseUrl(baseUrl)
                .client(OkHttpClient())
                /*.addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(ScalarsConverterFactory.create())*/
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build()

            okhttp = OkHttpClient.Builder()
                .connectTimeout(10000, TimeUnit.MILLISECONDS)
                .readTimeout(10000, TimeUnit.MILLISECONDS)
                .writeTimeout(10000, TimeUnit.MILLISECONDS)
                .build()
        }
        return retrofit!!
    }

}