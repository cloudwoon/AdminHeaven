package com.aedo.admin_heaven.api

import com.aedo.admin_heaven.NoticeModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header

interface APIService {

    //공지사항 모두조회 API
    @GET("v1/center/announcement")
    fun getNoti(@Header("Accesstoken")accesstoken: String?) : Call<NoticeModel>

}