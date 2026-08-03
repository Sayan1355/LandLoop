package com.example.landloop.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.landloop.features.fitness.FitnessScreen
import com.example.landloop.features.home.HomeScreen
import com.example.landloop.features.kingdom.KingdomScreen
import com.example.landloop.features.missions.MissionScreen
import com.example.landloop.features.profile.ProfileScreen
import com.example.landloop.features.expedition.ExpeditionScreen

@Composable
fun AppNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Routes.Home.route
    ) {

        composable(Routes.Home.route) {
            HomeScreen(navController)
        }

        composable(Routes.Expedition.route) {
            ExpeditionScreen(navController)
        }

        composable(Routes.Kingdom.route) {
            KingdomScreen(navController)
        }

        composable(Routes.Fitness.route) {
            FitnessScreen(navController)
        }

        composable(Routes.Profile.route) {
            ProfileScreen(navController)
        }

        composable(Routes.Missions.route) {
            MissionScreen(navController)
        }
    }
}

