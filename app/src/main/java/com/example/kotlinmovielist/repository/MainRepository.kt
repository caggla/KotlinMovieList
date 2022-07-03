package com.example.kotlinmovielist.repository

import com.example.kotlinmovielist.RetrofitService

class MainRepository constructor(private val retrofitService: RetrofitService) {

    fun getAllMovies() = retrofitService.getAllMovies()
}