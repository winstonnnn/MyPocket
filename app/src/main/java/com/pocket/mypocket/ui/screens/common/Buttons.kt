package com.pocket.mypocket.ui.screens.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun PrimaryButton(
    text: String,
    modifier: Modifier = Modifier,
    onclick: () -> Unit
) {
    Box(
        modifier = modifier
            .fillMaxWidth(.8f)
            .height(67.dp)
            .background(
                brush = Brush.verticalGradient(
                    listOf(
                        MaterialTheme.colorScheme.secondary,
                        MaterialTheme.colorScheme.primary,
                    )
                ),
                shape = RoundedCornerShape(33.dp)
            )
            .clickable { onclick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = regularStyle.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.tertiary
            )
        )
    }
}