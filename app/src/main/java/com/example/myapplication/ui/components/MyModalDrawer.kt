package com.example.myapplication.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyModalDrawer(content:@Composable () -> Unit) {
    val drawerState = rememberDrawerState(DrawerValue.Closed) //Necesario para controlar el estado del drawer
    val scope = rememberCoroutineScope() //Necesario para abrir y cerrar el drawer de forma asíncrona

    ModalNavigationDrawer( //Contenedor del drawer
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet { //Contenido del drawer
                Text(
                    text = "Menú de opciones",
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(16.dp)
                )
                NavigationDrawerItem( //Elemento del drawer
                    label = { Text("Inicio") },
                    selected = false,
                    onClick = {
                        scope.launch { drawerState.close() }
                    }
                )
            }
        }
    ){
        content() //Contenido principal de la pantalla que se le pasa por parámetro
    }
}
