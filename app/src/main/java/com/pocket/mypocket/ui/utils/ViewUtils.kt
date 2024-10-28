package com.pocket.mypocket.ui.utils

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun Modifier.clickableNoRipple(onclick: () -> Unit) : Modifier {
    return clickable(
        indication = null,
        interactionSource = remember { MutableInteractionSource() }
    ) {
        onclick()
    }
}