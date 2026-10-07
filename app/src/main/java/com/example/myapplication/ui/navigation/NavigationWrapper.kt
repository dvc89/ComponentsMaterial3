package com.example.myapplication.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.example.myapplication.ui.screens.Detail
import com.example.myapplication.ui.screens.DetailScreen
import com.example.myapplication.ui.screens.Home
import com.example.myapplication.ui.screens.HomeScreen
import com.example.myapplication.ui.screens.Login
import com.example.myapplication.ui.screens.LoginScreen


@Composable
fun NavigationWrapper() {
    val navController = rememberNavController() //Indica a que componente de navegación se va a dirigir
    NavHost(navController = navController, startDestination = Login) {
        //Aquí van las rutas de navegación
        composable<Home> {
            HomeScreen({navController.navigate(Login)})

        }
        composable<Login> {
            LoginScreen({navController.navigate(Home)},
                        {navController.navigate(Detail(usuario = it))} )
        }

        composable<Detail> { entry ->
            val detail : Detail = entry.toRoute()
            DetailScreen( detail.usuario , {navController.navigate(Home)} )
        }
    }
}