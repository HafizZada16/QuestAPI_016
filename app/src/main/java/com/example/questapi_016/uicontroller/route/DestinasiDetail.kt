package com.example.questapi_016.uicontroller.route

import com.example.questapi_016.R

object DestinasiDetail : DestinasiNavigasi {
    override val route = "item_detail"
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
    override val titleRes = R.string.detail_siswa
}