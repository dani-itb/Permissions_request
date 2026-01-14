package com.example.permissionsrequest.core.navigation

import kotlinx.serialization.Serializable


sealed class Destination {
    @Serializable
    object MapScreen: Destination()

    @Serializable
    object Marker: Destination()

}