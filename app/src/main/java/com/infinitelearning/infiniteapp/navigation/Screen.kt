package com.infinitelearning.infiniteapp.navigation

sealed class Screen (val route: String){
    data object Home : Screen("home")
    data object About: Screen("about")
    data object Pahlawan: Screen("pahlawan")
    data object Detail: Screen("detail_kabinet")
}