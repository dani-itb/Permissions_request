package com.example.permissionsrequest.features.map.ui

sealed class MapPermissionState {
    object Requesting : MapPermissionState()
    object ShowDenied : MapPermissionState()
    object ShowPermanentlyDenied : MapPermissionState()
    object NavigateToMap : MapPermissionState()
}
