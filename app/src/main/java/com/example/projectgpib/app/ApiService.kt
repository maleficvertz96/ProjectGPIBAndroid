package com.example.projectgpib.app

import com.example.projectgpib.model.ResponModel
import com.example.projectgpib.model.Menu
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {

    @FormUrlEncoded
    @POST("register")
    fun register(
        @Field("name") name: String,
        @Field("email") email: String,
        @Field("phone") phone: String,
        @Field("password") password: String
    ):Call<ResponModel>

    @FormUrlEncoded
    @POST("login")
    fun login(
        @Field("email") email :String,
        @Field("password") password :String
    ):Call<ResponModel>

    //menampilkan jadwal ibadah minggu
    @GET("ibadahminggu")
    fun getIbadahminggu():Call<ResponModel>

    //menampilkan jadwal ibadah pelkat
    @GET("ibadahpelkat")
    fun getIbadahpelkat():Call<ResponModel>

    //menampilkan jadwal kebaktian
    @GET("kebaktian")
    fun getKebaktian():Call<ResponModel>

    //menampilkan agenda kegiatan
    @GET("kegiatan")
    fun getKegiatan():Call<ResponModel>

    //menampilkan hut jemaat kelahiran / perkawinan
    @GET("hut")
    fun getHut():Call<ResponModel>

    //menampilkan jadwal pembinaan pelayan
    @GET("pembinaan")
    fun getPembinaan():Call<ResponModel>

    //menampilkan penerimaan
    @GET("penerimaan")
    fun getPenerimaan():Call<ResponModel>

    //menampilkan jadwal ibadah minggu
    @GET("pengeluaran")
    fun getPengeluaran():Call<ResponModel>
}