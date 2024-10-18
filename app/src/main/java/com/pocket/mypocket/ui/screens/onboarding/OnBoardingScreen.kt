package com.pocket.mypocket.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.pocket.mypocket.R

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.mipmap.onboarding_bg),
            contentScale = ContentScale.FillWidth,
            contentDescription = "Onboarding BG",
            modifier = Modifier
                .fillMaxWidth()
        )


    }
}

@Preview
@Composable
private fun preview() {
    Surface { OnBoardingScreen() }

}