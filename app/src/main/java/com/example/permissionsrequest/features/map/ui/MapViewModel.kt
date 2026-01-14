package com.example.permissionsrequest.features.map.ui

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.permissionsrequest.core.permissions.PermissionStatus

class MapViewModel: ViewModel() {
    private val _uiState =
        mutableStateOf<MapPermissionState>(MapPermissionState.Requesting)
    val uiState: State<MapPermissionState> = _uiState

    fun onPermissionResult(status: PermissionStatus) {
        _uiState.value = when (status) {
            PermissionStatus.Granted -> MapPermissionState.NavigateToMap
            PermissionStatus.Denied -> MapPermissionState.ShowDenied
            PermissionStatus.PermanentlyDenied -> MapPermissionState.ShowPermanentlyDenied
            PermissionStatus.Unknown -> MapPermissionState.Requesting
        }
    }
}