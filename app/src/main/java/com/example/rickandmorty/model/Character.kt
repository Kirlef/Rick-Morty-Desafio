package com.example.rickandmorty.model

import com.google.gson.annotations.SerializedName


data class Character(

    @SerializedName("id")
    val id: Int?,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String?,
    @SerializedName("species")
    val species: String?,
    @SerializedName("gender")
    val gender: String?,
    @SerializedName("image")
    val image: String?
)
