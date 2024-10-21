package com.pocket.mypocket.ui.navigation

import com.pocket.mypocket.R
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomNavigationScreens(
    val route: String,
    val defaultIcon: Int,
    val selectedIcon: Int
) {
    @Serializable
    data object HomeScreen: BottomNavigationScreens("Home", R.mipmap.nav_item_home, R.mipmap.nav_item_home_selected)
    @Serializable
    data object ChartScreen: BottomNavigationScreens("Chart", R.mipmap.nav_item_chart, R.mipmap.nav_item_chart_selected)
    @Serializable
    data object AssetScreen: BottomNavigationScreens("Asset", R.mipmap.nav_item_assets, R.mipmap.nav_item_assets_selected)
    @Serializable
    data object UserScreen: BottomNavigationScreens("User", R.mipmap.nav_item_user, R.mipmap.nav_item_user_selected)
}