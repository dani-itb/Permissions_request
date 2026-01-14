package com.example.permissionsrequest.features.marker.ui.create

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.permissionsrequest.core.permissions.AppPermission
import com.example.permissionsrequest.core.permissions.PermissionContent
import com.example.permissionsrequest.core.permissions.PermissionStatus
import com.example.permissionsrequest.core.permissions.rememberPermissionManager

@Composable
fun CreateMarkerScreen(
    viewModel: CreateMarkerViewModel = viewModel()
) {
    val permissionManager =
        rememberPermissionManager(AppPermission.CameraAndAudio)

    val uiState by viewModel.uiState

    LaunchedEffect(permissionManager.status) {
        if (permissionManager.status == PermissionStatus.Unknown) {
            permissionManager.requestPermissions()
        }
        viewModel.onPermissionResult(permissionManager.status)
    }

    when (uiState) {
        CreateMarkerPermissionState.NavigateToMap ->
            Text("Aquí iría el MAPA 🗺️")

        CreateMarkerPermissionState.ShowDenied ->
            PermissionContent(
                PermissionStatus.Denied,
                permissionManager.requestPermissions
            )

        CreateMarkerPermissionState.ShowPermanentlyDenied ->
            PermissionContent(
                PermissionStatus.PermanentlyDenied,
                {}
            )

        CreateMarkerPermissionState.Requesting ->
            PermissionContent(
                PermissionStatus.Unknown,
                permissionManager.requestPermissions
            )
    }
}