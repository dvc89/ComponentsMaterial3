package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MySlider(modifier: Modifier) {
    var valor by remember { mutableStateOf(50f) }

    Column(modifier = modifier.padding(16.dp)) {

        Slider(
            value = valor,
            onValueChange = { valor = it },
            valueRange = 0f..100f,  // rango de 0 a 100
            steps = 9               // divide en 10 pasos (opcional)
        )

        Text(text = "Valor seleccionado: ${valor.toInt()}")
    }
}
