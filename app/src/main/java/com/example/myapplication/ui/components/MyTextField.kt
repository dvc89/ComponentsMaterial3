package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.KeyboardOptions.Companion
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.KeyboardType

@Composable
fun EjemploTextField(modifier: Modifier) {
    var texto by rememberSaveable { mutableStateOf("") }

    Column(modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        // Campo de texto básico
        TextField(
            value = texto,
            onValueChange = { texto = it },
            label = { Text("Nombre") },
            placeholder = { Text("Escribe tu nombre") },
            singleLine = true,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            leadingIcon = { Icon(
                Icons.Default.Person,
                contentDescription = "Icono de usuario",
            ) },
            trailingIcon = { Icon(Icons.Default.Close, contentDescription = "Icono cerrar")},
        )

        // Mostramos lo que el usuario escribió
        Text(
            text = "Texto ingresado: $texto",
            modifier = Modifier.padding(top = 8.dp)
        )
    }
}