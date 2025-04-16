# Exemple de sol·licitud de diversos permisos en Jetpack compose
En aquest projecte trobareu el codi de com podem demanar diversos permisos de cop en arrencar l'aplicació.
## Temes clau 🔑
* Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.CAMERA, Manifest.permission.RECORD_AUDIO
* LaunchedEffect
* rememberLauncherForActivityResult(contract = ActivityResultContracts.RequestMultiplePermissions())
* ActivityCompat.shouldShowRequestPermissionRationale
* Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS)
* ViewModel
