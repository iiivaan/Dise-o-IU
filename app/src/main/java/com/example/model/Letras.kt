package com.example.model

import android.support.annotation.DrawableRes
import android.support.annotation.StringRes

data class Letras (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int ) {
}