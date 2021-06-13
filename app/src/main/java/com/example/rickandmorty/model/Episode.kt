package com.example.rickandmorty.model

import com.google.gson.annotations.SerializedName


data class Episode(

    @SerializedName("episode")
    val episode: String?,

    @SerializedName("air_date")
    val airDate: String?
)
