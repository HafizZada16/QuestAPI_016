package com.example.questapi_016.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.questapi_016.modeldata.UIStateSiswa
import com.example.questapi_016.repositori.RepositoryDataSiswa

class EditViewModel(savedStateHandle: SavedStateHandle,private val repositoryDataSiswa: RepositoryDataSiswa) : ViewModel() {
    var uiStateSiswa by mutableStateOf(UIStateSiswa())
        private set



}
