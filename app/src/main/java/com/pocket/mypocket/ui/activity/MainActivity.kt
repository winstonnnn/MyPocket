package com.pocket.mypocket.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.pocket.mypocket.ui.navigation.AppNavHost
import com.pocket.mypocket.ui.theme.MyPocketTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            MyPocketTheme {
                val navHostController = rememberNavController()
                AppNavHost(
                    navHostController = navHostController,
                    modifier = Modifier.fillMaxSize()
                )
            }
        }
    }
}
