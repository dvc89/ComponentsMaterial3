package com.example.myapplication.ui.components

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import coil.compose.AsyncImage

@Composable
fun MyImageInternet(modifier: Modifier = Modifier) {

    AsyncImage(
        model = "https://picsum.photos/800/500",
        contentDescription = "Imagen de internet",
        modifier = modifier,
        onSuccess = {
            Log.d("COIL", "Imagen cargada correctamente")
        },
        onError = {
            Log.e("COIL", "Error: ${it.result.throwable}")
        }
    )
}