package com.example.permissionsrequest.core.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.permissionsrequest.core.navigation.Destination

enum class DrawerItem(
    val icon: ImageVector,
    val text: String,
    val destination: Destination
) {
    Map(Icons.Default.Home, "Mapa", Destination.MapScreen),
    Marker(Icons.Default.Info, "Crear marcador", Destination.Marker)
}