package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyContadorState(modifier: Modifier) {
    // Estado que recuerda el valor del contador
    var contador by rememberSaveable { mutableStateOf(0) }
    Column(
        modifier = modifier.padding(16.dp)
        .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Has hecho clic $contador veces",
            fontSize = 24.sp,
            color = Color.Red,
            )
        Button(onClick = { contador +=1 }) {
            Text("Aumentar")
        }
        Button(onClick = { contador = 0 }) {
            Text("Reiniciar")
        }
    }
}