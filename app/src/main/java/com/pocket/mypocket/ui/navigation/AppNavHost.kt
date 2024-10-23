package com.pocket.mypocket.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.pocket.mypocket.ui.screens.chart.ChartScreen
import com.pocket.mypocket.ui.screens.home.HomeScreen
import com.pocket.mypocket.ui.screens.onboarding.OnBoardingScreen
import com.pocket.mypocket.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    onShowBottomNavigationBar: () -> Unit
) {
    NavHost(
        navHostController,
        startDestination = SplashScreen,
        modifier = modifier
    ) {
        composable<SplashScreen>{
            SplashScreen(navHostController)
        }

        composable<OnBoardingScreen> {
            OnBoardingScreen(navHostController)
        }

        composable<HomeScreen> {
            onShowBottomNavigationBar()
            HomeScreen(navHostController)
        }

        composable<ChartScreen> {
            ChartScreen(navHostController)
        }
    }
}