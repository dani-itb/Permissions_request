package com.example.permissionsrequest.viewmodels

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.State
import com.example.permissionsrequest.utils.PermissionStatus

class PermissionViewModel: ViewModel() {
    private val _permissionsStatus = mutableStateOf<Map<String, PermissionStatus>>(emptyMap())
    val permissionsStatus: State<Map<String, PermissionStatus>> = _permissionsStatus

    fun updatePermissionStatus(permission: String, status: PermissionStatus) {
        _permissionsStatus.value = _permissionsStatus.value.toMutableMap().apply {
            this[permission] = status
        }
    }
}