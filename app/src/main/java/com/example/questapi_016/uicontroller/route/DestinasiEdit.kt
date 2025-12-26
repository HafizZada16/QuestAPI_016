package com.example.questapi_016.uicontroller.route

import com.example.questapi_016.R

object DestinasiEdit : DestinasiNavigasi {
    override val route = "item_edit"
    const val itemIdArg = "idSiswa"
    val routeWithArgs = "$route/{$itemIdArg}"
    override val titleRes = R.string.edit_siswa
}