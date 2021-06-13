package com.example.rickandmorty.ui.character;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0011\u001a\u00020\u00122\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0002J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010J\u0012\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0018J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u0018J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0018H\u0002J\u0006\u0010\u001a\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/rickandmorty/ui/character/CharacterViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/rickandmorty/repository/CharacterRepository;", "(Lcom/example/rickandmorty/repository/CharacterRepository;)V", "characterList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/rickandmorty/model/Character;", "error", "", "isQueryAvailable", "", "pageNumber", "", "queryName", "", "checkLastQuery", "", "characters", "getCharacters", "page", "name", "getCharactersLiveData", "Landroidx/lifecycle/LiveData;", "getErrorLiveData", "searchNextPage", "app_devDebug"})
public final class CharacterViewModel extends androidx.lifecycle.ViewModel {
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.rickandmorty.model.Character>> characterList = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Throwable> error = null;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isQueryAvailable = null;
    private int pageNumber = 1;
    private java.lang.String queryName = "";
    private final com.example.rickandmorty.repository.CharacterRepository repository = null;
    
    public final void getCharacters(int page, @org.jetbrains.annotations.Nullable()
    java.lang.String name) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.rickandmorty.model.Character>> getCharactersLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Throwable> getErrorLiveData() {
        return null;
    }
    
    public final void searchNextPage() {
    }
    
    private final androidx.lifecycle.LiveData<java.lang.Boolean> isQueryAvailable() {
        return null;
    }
    
    private final void checkLastQuery(java.util.List<com.example.rickandmorty.model.Character> characters) {
    }
    
    public CharacterViewModel(@org.jetbrains.annotations.NotNull()
    com.example.rickandmorty.repository.CharacterRepository repository) {
        super();
    }
}