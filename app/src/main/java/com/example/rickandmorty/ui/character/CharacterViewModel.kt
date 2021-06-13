package com.example.rickandmorty.ui.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.model.Character
import com.example.rickandmorty.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class CharacterViewModel(private val repository: CharacterRepository) : ViewModel() {

    private val characterList = MutableLiveData<List<Character>>()
    private val error = MutableLiveData<Throwable>()
    private val isQueryAvailable = MutableLiveData<Boolean>()
    private var pageNumber: Int = 1
    private var queryName: String? = ""

    fun getCharacters(page: Int, name: String?) {
        isQueryAvailable.value = false
        pageNumber = page
        queryName = name
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                runCatching { repository.getCharacters(page, name) }
            }
            result.onSuccess { characterList.value = it }
            result.onFailure { error.value = it }
            checkLastQuery(characterList.value?.toList())
        }
    }

    fun getCharactersLiveData(): LiveData<List<Character>> {
        return characterList
    }

    fun getErrorLiveData(): LiveData<Throwable> {
        return error
    }

    fun searchNextPage() {
        if (!isQueryAvailable().value!!) {
            var currentCharacters: MutableList<Character>? = characterList.value?.toMutableList()
            viewModelScope.launch {
                val result1 = withContext(Dispatchers.IO) {
                    runCatching { repository.getCharacters(pageNumber + 1, queryName) }
                }
                result1.onSuccess { characterList.value = it }
                result1.onFailure { error.value = it }

                checkLastQuery(characterList.value?.toList())
                characterList.value?.let { currentCharacters?.addAll(it) }
                characterList.postValue(currentCharacters)
                pageNumber++
            }
        }
    }

    private fun isQueryAvailable(): LiveData<Boolean> {
        return isQueryAvailable
    }

    private fun checkLastQuery(characters: List<Character>?) {
        if (characters != null) {
            if (characters.size % 20 != 0) {
                isQueryAvailable.value = true
            }
        } else {
            isQueryAvailable.value = true
        }
    }
}
