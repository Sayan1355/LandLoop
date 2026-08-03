package com.example.landloop.core.navigation

sealed class Routes(val route: String) {

    data object Home : Routes("home")

    data object Expedition : Routes("expedition")

    data object Kingdom : Routes("kingdom")

    data object Missions : Routes("missions")

    data object Fitness : Routes("fitness")

    data object Profile : Routes("profile")
}

