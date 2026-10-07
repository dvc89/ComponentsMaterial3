package com.example.myapplication.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyText() {
    Column(modifier = Modifier.background(Color.Blue).padding(16.dp)) {
        // Texto grande como título
        Text(
            text = "Hola perlicas",
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Yellow
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MyText2() {
    Column(modifier = Modifier.padding(16.dp)) {
        // Texto grande como título
        Text(
            text = "Hola perlicas",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}

