package com.example.questapi_016.uicontroller.route

import com.example.questapi_016.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "detail_siswa"
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
    override val titleRes = R.string.detail_siswa
}