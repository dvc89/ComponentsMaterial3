package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun MyColumn() {
    Column(modifier = Modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Pimientos", fontSize = 24.sp)
        Text("Kiwis", fontSize = 24.sp)
        Button(onClick = { }) {
            Text("Dámelos", fontSize = 36.sp)
        }
    }
}