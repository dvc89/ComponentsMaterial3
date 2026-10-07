package com.example.myapplication.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
@Composable
fun LoginScreen(navigateToHome: () -> Unit, navigateToDetail : (String) -> Unit) {

    var username by remember {mutableStateOf("")}

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text("Welcome to the Login Screen!")
        TextField(value = username, onValueChange = { username = it}, label = { Text(text = "Usuario") })
        Button(onClick = { navigateToHome() }) { Text("Ir a Home") }
        Button(onClick = { navigateToDetail(username) }) { Text("Ir a detalles") }
    }

}