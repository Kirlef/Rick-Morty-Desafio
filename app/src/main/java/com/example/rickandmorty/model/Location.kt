package com.example.rickandmorty.model

import com.google.gson.annotations.SerializedName


data class Location(

    @SerializedName("name")
    val name: String?
)
