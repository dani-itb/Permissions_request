package com.example.permissionsrequest.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.permissionsrequest.core.layout.MainScaffold
import com.example.permissionsrequest.features.map.ui.MapScreen
import com.example.permissionsrequest.features.marker.ui.create.CreateMarkerScreen

@Composable
fun AppNavHost(navController: NavHostController) {
    MainScaffold(navController) {
        NavHost(
            navController = navController,
            startDestination = Destination.MapScreen
        ) {
            composable<Destination.MapScreen> { MapScreen() }
            composable<Destination.Marker> { CreateMarkerScreen() }
        }
    }
}