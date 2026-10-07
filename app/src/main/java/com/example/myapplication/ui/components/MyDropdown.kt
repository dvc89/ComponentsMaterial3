package com.example.myapplication.ui.components


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyDropdown(modifier: Modifier) {
    var expanded by remember { mutableStateOf(true) }    // controla si el menú está abierto
    val opciones = listOf("Boquerones", "Sardinas", "Mu fresco")
    val icons = listOf("🐟", "🐠", "🦑")
    var selectedOption by remember { mutableStateOf(opciones[0]) }
    Column(modifier = modifier.padding(16.dp)) {
        // Botón que abre o cierra el menú
        Button(onClick = { expanded = !expanded }) {
            Text(selectedOption)
        }
        // Menú desplegable
        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false } // se cierra al tocar fuera
        ) {
            opciones.forEachIndexed { index, opcion ->
                DropdownMenuItem(
                    text = { Text(opcion) },
                    onClick = {
                        selectedOption = opcion
                        expanded = false
                    },
                    leadingIcon = { Text(icons[index]) }
                )
            }
        }
    }
}
