package com.example.myapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun MyBox(modifier : Modifier = Modifier) {
    Box(modifier = modifier
        .background(Color.Blue)
        .padding(16.dp), contentAlignment = Alignment.Center) {
        Box(modifier = Modifier
            .background(Color.Magenta)
            .padding(16.dp), contentAlignment = Alignment.Center) {
            Text(text = "Churris, esto es un texto dentro de dos cajas ",
                modifier = Modifier.background(Color.Yellow).padding(8.dp))
        }
    }
}
