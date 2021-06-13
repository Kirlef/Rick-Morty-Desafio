package com.example.rickandmorty.ui.characterdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rickandmorty.model.CharacterDetail
import com.example.rickandmorty.repository.CharacterRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class CharacterDetailViewModel(private val repository: CharacterRepository) : ViewModel() {

    private val characterDetail = MutableLiveData<CharacterDetail>()
    private val characterError = MutableLiveData<Throwable>()


    fun getCharacterById(id: Int) {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO) {
                runCatching { repository.getCharacterById(id) }
            }
            result.onSuccess { characterDetail.value = it }
            result.onFailure { characterError.value = it }
        }
    }

    fun getCharacterLiveData(): LiveData<CharacterDetail> {
        return characterDetail
    }

    fun getErrorLiveData(): LiveData<Throwable> {
        return characterError
    }
}