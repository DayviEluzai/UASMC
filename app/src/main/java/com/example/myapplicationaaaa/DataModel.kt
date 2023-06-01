package com.example.myapplicationaaaa

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DataModel(
    val img: Int,
    val title : String,
    val dec: String
): Parcelable
