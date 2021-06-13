package com.example.rickandmorty.service.response

import com.google.gson.annotations.SerializedName
import com.example.rickandmorty.model.Character



data class CharactersResponse(
    @SerializedName("results")
    val results: List<Character>,
    @SerializedName("info")
    val info: ResultInfo
)
