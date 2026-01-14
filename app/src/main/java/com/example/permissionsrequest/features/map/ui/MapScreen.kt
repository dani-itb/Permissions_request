package com.example.permissionsrequest.features.map.ui


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
fun MapScreen(viewModel: MapViewModel = viewModel()) {
    val permissionManager =
        rememberPermissionManager(AppPermission.Location)

    val uiState by viewModel.uiState

    LaunchedEffect(permissionManager.status) {
        if (permissionManager.status == PermissionStatus.Unknown) {
            permissionManager.requestPermissions()
        }
        viewModel.onPermissionResult(permissionManager.status)
    }

    when (uiState) {
        MapPermissionState.NavigateToMap ->
            Text("Aquí iría el MAPA")

        MapPermissionState.ShowDenied ->
            PermissionContent(
                PermissionStatus.Denied,
                permissionManager.requestPermissions
            )

        MapPermissionState.ShowPermanentlyDenied ->
            PermissionContent(
                PermissionStatus.PermanentlyDenied,
                {}
            )

        MapPermissionState.Requesting ->
            PermissionContent(
                PermissionStatus.Unknown,
                permissionManager.requestPermissions
            )
    }
}
