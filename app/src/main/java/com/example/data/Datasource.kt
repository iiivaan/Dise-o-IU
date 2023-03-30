package com.example.data

import com.example.letras.R
import com.example.model.Letras

class Datasource {

    fun loadLetras(): List<Letras> {
        return listOf<Letras>(
            Letras(R.string.Post1),
            Letras(R.string.Post2),
            Letras(R.string.Post3),
            Letras(R.string.Post4),
            Letras(R.string.Post5),
            Letras(R.string.Post6),
            Letras(R.string.Post7),

        )

    }
}