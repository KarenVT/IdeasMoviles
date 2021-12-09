package com.example.magiacafetera.data

import com.example.magiacafetera.model.DataLugares
import com.example.magiacafetera.model.Restaurantes
import retrofit2.http.GET

interface ApiService {
    @GET("/Henrygyovas/IdeasMoviles/lugares")
    suspend fun getLugares(): DataLugares
}