package com.example.myinventor.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Inventor (
    val id: String,
    val name: String,
    val photoUrl: String,
    val desc: String
    ) : Parcelable