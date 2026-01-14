package com.example.permissionsrequest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.permissionsrequest.core.navigation.AppNavHost
import com.example.permissionsrequest.core.theme.PermissionsRequestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PermissionsRequestTheme {
                val navController = rememberNavController()
                AppNavHost(navController = navController)
            }
        }
    }
}