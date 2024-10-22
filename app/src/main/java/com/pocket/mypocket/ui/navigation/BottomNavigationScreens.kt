package com.pocket.mypocket.ui.navigation

import com.pocket.mypocket.R
import kotlinx.serialization.Serializable

@Serializable
sealed class BottomNavigationScreens<T>(
    val route: T,
    val defaultIcon: Int,
    val selectedIcon: Int
) {
    @Serializable
    data object Home: BottomNavigationScreens<HomeScreen>(route = HomeScreen, R.mipmap.nav_item_home, R.mipmap.nav_item_home_selected)

    @Serializable
    data object Chart: BottomNavigationScreens<ChartScreen>(route = ChartScreen, R.mipmap.nav_item_chart, R.mipmap.nav_item_chart_selected)

    @Serializable
    data object Asset: BottomNavigationScreens<AssetScreen>(route = AssetScreen, R.mipmap.nav_item_assets, R.mipmap.nav_item_assets_selected)

    @Serializable
    data object User: BottomNavigationScreens<UserScreen>(route = UserScreen, R.mipmap.nav_item_user, R.mipmap.nav_item_user_selected)
}