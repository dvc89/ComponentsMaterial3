package com.example.myapplication.ui.screens

import kotlinx.serialization.Serializable

@Serializable
object Login

@Serializable
object Home

@Serializable
data class Detail(val usuario: String)