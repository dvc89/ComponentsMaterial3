package com.example.myapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.example.myapplication.R

@Composable
fun ImagenLocal(modifier : Modifier){
    Image(
        painter = painterResource(id = R.drawable.images),
        contentDescription = "Escudo UCAM",
        modifier = modifier
    )
}