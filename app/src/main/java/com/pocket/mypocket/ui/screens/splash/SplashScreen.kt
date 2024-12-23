package com.pocket.mypocket.ui.screens.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.pocket.mypocket.R
import com.pocket.mypocket.ui.navigation.OnBoardingScreen
import com.pocket.mypocket.ui.theme.Inter_bold
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(
    navHostController: NavHostController
) {
    SplashScreen(
        onFinishSplash = {
            navHostController.navigate(OnBoardingScreen)
        }
    )
}
@Composable
fun SplashScreen(
    modifier: Modifier = Modifier,
    onFinishSplash: () -> Unit
) {
    LaunchedEffect(Unit) {
        delay(3000)
        onFinishSplash()
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        MaterialTheme.colorScheme.secondary,
                        MaterialTheme.colorScheme.primary,
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = stringResource(R.string.app_name),
            style = TextStyle(
                fontSize = 50.sp,
                fontFamily = Inter_bold,
                letterSpacing = (-3).sp,
                color = MaterialTheme.colorScheme.tertiary
            )
        )
    }
}

@Preview
@Composable
private fun Preview() {
    Surface {
        SplashScreen {  }
    }
}