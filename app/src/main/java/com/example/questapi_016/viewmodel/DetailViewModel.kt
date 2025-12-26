@file:OptIn(InternalSerializationApi::class)

package com.example.questapi_016.viewmodel

import com.example.questapi_016.modeldata.DataSiswa

sealed interface StatusUIDetail {
    data class Success(val SatuSiswa: DataSiswa) : StatusUIDetail
    object Error : StatusUIDetail
    object Loading : StatusUIDetail
}