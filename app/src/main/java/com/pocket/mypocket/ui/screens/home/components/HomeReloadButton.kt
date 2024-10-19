package com.pocket.mypocket.ui.screens.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.pocket.mypocket.ui.theme.White6

@Composable
fun HomeReloadButton(
    modifier: Modifier = Modifier,
    onclick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .size(40.dp)
            .background(
                color = White6,
                shape = RoundedCornerShape(7.dp)
            )
            .clickable { onclick() },
        contentAlignment = Alignment.Center
    ) {
        Icon(
            Icons.Default.Refresh,
            contentDescription = "Refresh Icon",
            tint = MaterialTheme.colorScheme.tertiary
        )
    }
}