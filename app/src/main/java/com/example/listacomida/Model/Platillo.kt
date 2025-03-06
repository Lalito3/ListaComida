package com.example.listacomida.Model

import android.content.res.Resources
import androidx.annotation.StringRes
import androidx.annotation.DrawableRes


data class Platillo(
    @StringRes val stringResourceId: Int,
    val precio: Double,
    val oferta:String,
    @DrawableRes val drawableResId: Int
)

