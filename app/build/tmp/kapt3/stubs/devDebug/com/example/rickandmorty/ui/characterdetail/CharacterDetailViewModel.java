package com.example.rickandmorty.ui.characterdetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u000fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/rickandmorty/ui/characterdetail/CharacterDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/rickandmorty/repository/CharacterRepository;", "(Lcom/example/rickandmorty/repository/CharacterRepository;)V", "characterDetail", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/rickandmorty/model/CharacterDetail;", "characterError", "", "getCharacterById", "", "id", "", "getCharacterLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "app_devDebug"})
public final class CharacterDetailViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<com.example.rickandmorty.model.CharacterDetail> characterDetail = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> characterError = null;
    private final com.example.rickandmorty.repository.CharacterRepository repository = null;
    
    public final void getCharacterById(int id) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.rickandmorty.model.CharacterDetail> getCharacterLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Throwable> getErrorLiveData() {
        return null;
    }
    
    public CharacterDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.repository.CharacterRepository repository) {
        super();
    }
}