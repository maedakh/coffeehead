package com.example.coffeehead

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Coffee (
    var name: String = "",
    var detail: String = "",
    var photo: Int = 0
):Parcelable