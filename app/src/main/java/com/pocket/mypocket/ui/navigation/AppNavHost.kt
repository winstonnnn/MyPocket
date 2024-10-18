package com.pocket.mypocket.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pocket.mypocket.ui.screens.onboarding.OnBoardingScreen
import com.pocket.mypocket.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController
) {
    NavHost(
        navHostController,
        startDestination = OnBoarding,
        modifier = modifier
    ) {
        composable<Splash> {
            SplashScreen()
        }

        composable<OnBoarding> {
            OnBoardingScreen()
        }
    }
}