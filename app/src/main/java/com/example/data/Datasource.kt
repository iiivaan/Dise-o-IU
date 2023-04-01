package com.example.data

import com.example.letras.R
import com.example.model.Letras

class Datasource {

    fun loadLetras(): List<Letras> {
        return listOf<Letras>(
            Letras(R.string.Post1, R.drawable.user1),
            Letras(R.string.Post2, R.drawable.user1),
            Letras(R.string.Post3, R.drawable.user1),
            Letras(R.string.Post4, R.drawable.user1),
            Letras(R.string.Post5, R.drawable.user1),
            Letras(R.string.Post6, R.drawable.user1),
            Letras(R.string.Post7, R.drawable.user1),

        )

    }
}