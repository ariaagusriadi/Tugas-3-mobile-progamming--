package com.aria.tokopaklatef.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class user (
    val lbl : String,
    val price : String
        ) : Parcelable