package com.pocket.mypocket.ui.screens.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.pocket.mypocket.R

@Composable
fun CommonTopCurveBackground(modifier: Modifier = Modifier) {
    Image(
        painter = painterResource(R.mipmap.common_top_curve_bg),
        contentScale = ContentScale.FillWidth,
        contentDescription = "Common Top Background",
        modifier = Modifier
            .fillMaxWidth()
    )
}