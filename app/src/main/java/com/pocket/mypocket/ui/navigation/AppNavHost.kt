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
    onShowBottomNavigationBar: () -> Unit,
    setStatusBarTextColorIsDark: (isDark: Boolean) -> Unit,
) {
    NavHost(
        navHostController,
        startDestination = SplashScreen,
        modifier = modifier
    ) {
        composable<SplashScreen>{
            setStatusBarTextColorIsDark(false)
            SplashScreen(navHostController)
        }

        composable<OnBoardingScreen> {
            setStatusBarTextColorIsDark(true)
            OnBoardingScreen(navHostController)
        }

        composable<HomeScreen> {
            setStatusBarTextColorIsDark(false)
            onShowBottomNavigationBar()
            HomeScreen(navHostController)
        }

        composable<ChartScreen> {
            setStatusBarTextColorIsDark(true)
            ChartScreen(navHostController)
        }
    }
}