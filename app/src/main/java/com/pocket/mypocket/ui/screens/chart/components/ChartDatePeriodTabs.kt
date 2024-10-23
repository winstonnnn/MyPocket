package com.pocket.mypocket.ui.screens.chart.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.ui.screens.common.AnimatedTabIndicator
import com.pocket.mypocket.ui.theme.ChartTabSelectedTextColor
import com.pocket.mypocket.ui.theme.ChartTabUnSelectedTextColor
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun ChartDatePeriodTabs(modifier: Modifier = Modifier) {
    val tabWidth = 90.dp
    val tabsSpaceBetween = 10.dp
    val items = DatePeriod.entries
    var selectedTab by remember { mutableIntStateOf(0) }

    Box(
        modifier = modifier
            .wrapContentWidth()
            .height(40.dp)
    ) {
        AnimatedTabIndicator(
            tabWidth = tabWidth,
            tabsSpaceBetween = tabsSpaceBetween,
            selectedTab = selectedTab
        )

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(tabsSpaceBetween)
        ) {
            items.forEachIndexed { index, datePeriod ->
                TabItem(
                    text = datePeriod.datePeriodName,
                    isSelected = index == selectedTab,
                    onItemClick = {
                        selectedTab = index
                    }
                )
            }
        }
    }
}

@Composable
private fun TabItem(
    text: String,
    isSelected: Boolean,
    onItemClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .height(40.dp)
            .width(90.dp)
            .clickable(
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            ) { onItemClick() },
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = text,
            style = regularStyle.copy(
                fontSize = 13.sp,
                color = if (isSelected) ChartTabSelectedTextColor else ChartTabUnSelectedTextColor,
                textAlign = TextAlign.Center
            )
        )
    }

}