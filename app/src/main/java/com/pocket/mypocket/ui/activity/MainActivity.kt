package com.pocket.mypocket.ui.activity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.rememberNavController
import com.pocket.mypocket.ui.navigation.AppNavHost
import com.pocket.mypocket.ui.navigation.BottomNavigationBar
import com.pocket.mypocket.ui.theme.MyPocketTheme
import com.pocket.mypocket.ui.utils.changeStatusBarTextColor


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        setContent {
            MyPocketTheme {
                val navHostController = rememberNavController()
                val isShowBottomNavigationBar = remember {
                    mutableStateOf(false)
                }

                Column(
                    modifier = Modifier
                        .navigationBarsPadding()
                ) {
                    AppNavHost(
                        navHostController = navHostController,
                        modifier = Modifier
                            .fillMaxWidth()
                            .weight(1f),
                        onShowBottomNavigationBar = {
                            isShowBottomNavigationBar.value = true
                        },
                        setStatusBarTextColorIsDark = { isDark ->
                            changeStatusBarTextColor(isDark)
                        }
                    )

                    if (isShowBottomNavigationBar.value) {
                        BottomNavigationBar(navHostController)
                    }
                }
            }
        }
    }
}
