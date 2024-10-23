package com.pocket.mypocket.ui.screens.common

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import com.pocket.mypocket.ui.theme.Green100

/**
 * AnimatedTabIndicator is an indicator with animation for tab layouts
 * @param tabWidth width of tab
 * @param tabsSpaceBetween this is the extra space put between the tabs. Will be added to the tabWidth when calculation the offset
 * @param selectedTab index of selected tab. To be multiplied to tabWidth
 */
@Composable
fun AnimatedTabIndicator(
    tabWidth: Dp,
    tabsSpaceBetween: Dp,
    selectedTab: Int
) {
    val animatedIndicatorOffsetX by animateDpAsState(
        targetValue = (tabWidth + tabsSpaceBetween) * selectedTab,
        label = "offset of animation indicator"
    )

    Box(
        modifier = Modifier
            .width(tabWidth)
            .fillMaxHeight()
            .offset{
                IntOffset(animatedIndicatorOffsetX.toPx().toInt(), 0)
            }
            .background(
                color = Green100,
                shape = RoundedCornerShape(10.dp)
            )

    )
}