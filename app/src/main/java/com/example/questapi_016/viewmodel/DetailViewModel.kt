@file:OptIn(InternalSerializationApi::class)

package com.example.questapi_016.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlinx.serialization.InternalSerializationApi
import com.example.questapi_016.modeldata.DataSiswa
import com.example.questapi_016.repositori.RepositoryDataSiswa

sealed interface StatusUIDetail {
    data class Success(val SatuSiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}
class DetailViewModel(savedStateHandle: SavedStateHandle, private val repositoryDataSiswa: RepositoryDataSiswa): ViewModel() {
    private val idSiswa: Int = checkNotNull(savedStateHandle[DestinasiDetail.idSiswaArg])
    var statusUIDetail: StatusUIDetail by mutableStateOf(StatusUIDetail.Loading)
        private set

    init {
        getDataSiswa()
    }

}