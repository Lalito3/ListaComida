package com.example.listacomida.Data

import com.example.listacomida.Model.Platillo
import com.example.listacomida.R

class DataSource() {
    fun loadPlatillos(): List<Platillo>{
        return listOf<Platillo>(
            Platillo(R.string.desayuno, 100.00, "Martes y Jueves son de niños gratis",R.drawable.desayuno),
            Platillo(R.string.Postre, 60.00, "Bebida libre", R.drawable.postre),
            Platillo(R.string.pozole, 80.00, "Gratis para estudiantes universitarios", R.drawable.pozole),
            Platillo(R.string.Tacos,180.00,"15 tacos", R.drawable.tacos),
            Platillo(R.string.pizza,220.00,"Martes de 2x1", R.drawable.pizza),
            Platillo(R.string.hamburguer,70.00,"Con cualquier topping extra", R.drawable.hamburguer)

        )


    }
}