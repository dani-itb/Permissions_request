package com.example.permissionsrequest.features.marker.ui.create

sealed class CreateMarkerPermissionState {
    object Requesting : CreateMarkerPermissionState()
    object ShowDenied : CreateMarkerPermissionState()
    object ShowPermanentlyDenied : CreateMarkerPermissionState()
    object NavigateToMap : CreateMarkerPermissionState()
}
