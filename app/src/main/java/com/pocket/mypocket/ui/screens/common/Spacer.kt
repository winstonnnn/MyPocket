package com.pocket.mypocket.ui.screens.common

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp

@Composable
fun VerticalSpacer(space: Float) {
    Spacer(Modifier.fillMaxHeight(space))
}

@Composable
fun VerticalSpacer(space: Dp) {
    Spacer(Modifier.height(space))
}

@Composable
fun HorizontalSpacer(space: Float) {
    Spacer(Modifier.fillMaxWidth(space))
}

@Composable
fun HorizontalSpacer(space: Dp) {
    Spacer(Modifier.width(space))
}