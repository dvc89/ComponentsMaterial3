package com.example.myapplication.ui.components
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyRadioButton(modifier: Modifier) {
    val opciones = listOf("Opción A", "Opción B", "Opción C")
    var seleccion by remember { mutableStateOf(opciones[0]) }

    Column(modifier = modifier.padding(4.dp)) {
        opciones.forEach { opcion ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                RadioButton(
                    selected = (opcion == seleccion),
                    onClick = { seleccion = opcion }
                )
                Text(text = opcion)
            }
        }

        Text(text = "Seleccionaste: $seleccion")
    }
}