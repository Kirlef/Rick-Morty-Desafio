package com.example.rickandmorty.di

import com.example.rickandmorty.repository.CharacterRepository
import com.example.rickandmorty.ui.character.CharacterViewModel
import com.example.rickandmorty.ui.characterdetail.CharacterDetailViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {

    factory { CharacterRepository(get()) }

    viewModel { CharacterViewModel(get()) }

    viewModel { CharacterDetailViewModel(get()) }
}
