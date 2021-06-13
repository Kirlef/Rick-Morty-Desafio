package com.example.rickandmorty.repository

import com.example.rickandmorty.model.Character
import com.example.rickandmorty.model.CharacterDetail
import com.example.rickandmorty.service.RickAndMortyAPI

class CharacterRepository(private val api: RickAndMortyAPI) {

    suspend fun getCharacters(page: Int, name: String?): List<Character> {
        return api.getCharacters(page.toString(), name).results
    }

    suspend fun getCharacterById(id: Int): CharacterDetail {
        return api.getCharacterDetail(id)
    }
}
