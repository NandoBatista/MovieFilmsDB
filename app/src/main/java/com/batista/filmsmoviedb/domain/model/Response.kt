package com.batista.filmsmoviedb.domain.model

import com.google.gson.annotations.SerializedName

data class Response(
    @SerializedName("dates")
    val dates: Dates,
    @SerializedName("page")
    val page: Int,
    @SerializedName("resultMovies")
    val resultMovies: List<ResultMovie>,
    @SerializedName("total_pages")
    val total_pages: Int,
    @SerializedName("total_results")
    val total_results: Int
)