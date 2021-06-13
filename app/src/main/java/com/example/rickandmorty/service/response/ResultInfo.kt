package com.example.rickandmorty.service.response

import com.google.gson.annotations.SerializedName


data class ResultInfo(

    @SerializedName("count")
    val count: Int,
    @SerializedName("pages")
    val pages: Int,
    @SerializedName("next")
    val next: String?,
    @SerializedName("prev")
    val prev: String?,
)
