package com.pocket.mypocket.ui.screens.chart.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.ui.theme.ChartTabSelectedTextColor
import com.pocket.mypocket.ui.theme.ChartTabUnSelectedTextColor
import com.pocket.mypocket.ui.theme.Green100
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun ChartDatePeriodTabs(modifier: Modifier = Modifier) {
    val items = DatePeriod.entries
    val selectedTab = items[0]

    Box(
        modifier = modifier
            .wrapContentWidth()
            .height(40.dp)
    ) {
        //TODO(indicator)

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items.forEach { datePeriod ->
                TabItem(
                    text = datePeriod.datePeriodName,
                    isSelected = datePeriod == selectedTab,
                    onItemClick = {

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
            .clickable { onItemClick() }
            .background(color = if (isSelected) Green100 else Color.Transparent),
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