package com.pocket.mypocket.ui.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.toRoute
import com.pocket.mypocket.R

@Composable
fun BottomNavigationBar(
    navHostController: NavHostController,
    modifier: Modifier = Modifier
) {
    val currentRoute by navHostController.currentBackStackEntryAsState()

    BottomNavigationBar(
        currentRoute = currentRoute?.toRoute() ?: BottomNavigationScreens.HomeScreen,
        onNavItemClick = { route ->
            navHostController.navigate(route){
                popUpTo(navHostController.graph.startDestinationId) { saveState = true }
                launchSingleTop = true
                restoreState = true
            }
        }
    )
}
@Composable
fun BottomNavigationBar(
    currentRoute: BottomNavigationScreens,
    onNavItemClick: (route: BottomNavigationScreens)-> Unit,
    modifier: Modifier = Modifier
) {

    val items = listOf(
        BottomNavigationScreens.HomeScreen,
        BottomNavigationScreens.ChartScreen,
        BottomNavigationScreens.AssetScreen,
        BottomNavigationScreens.UserScreen,
    )

    Box(
        modifier = modifier
            .fillMaxWidth()
            .height(85.dp)
            .background(MaterialTheme.colorScheme.tertiary)
    ) {
        Image(
            painter = painterResource(R.mipmap.bottom_nav_bar_bg),
            contentScale = ContentScale.FillWidth,
            contentDescription = "Bottom Navigation Bar Background"
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .offset(y = 5.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            items.forEach { item ->
                println("testtest " + currentRoute + " " +item)
                BottomBavBarItem(
                    defaultIcon = item.defaultIcon,
                    selectedIcon = item.selectedIcon,
                    isSelected = currentRoute == item,
                    onNavItemClick = {
                        if (currentRoute != item) {
                            onNavItemClick(item)
                        }
                        onNavItemClick(item)
                    }
                )
            }
        }
    }
}

@Composable
private fun BottomBavBarItem(
    modifier: Modifier = Modifier,
    defaultIcon: Int,
    selectedIcon: Int,
    isSelected: Boolean,
    onNavItemClick: ()-> Unit
) {
    Box(
        modifier = modifier
            .clickable {
                onNavItemClick()
            }
    ) {
        Image(
            painter = painterResource(
                if (isSelected) {
                    selectedIcon
                } else {
                    defaultIcon
                }
            ),
            contentScale = ContentScale.Fit,
            contentDescription = "Navigation Item Icon"
        )
    }

}

@Preview
@Composable
private fun PreviewNavigationBar() {
    BottomNavigationBar(
        BottomNavigationScreens.HomeScreen,
        onNavItemClick = {}
    )
}