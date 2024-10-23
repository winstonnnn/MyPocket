package com.pocket.mypocket.ui.screens.chart

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.pocket.mypocket.R
import com.pocket.mypocket.ui.screens.chart.components.ChartDatePeriodTabs
import com.pocket.mypocket.ui.screens.common.CommonPagesHorizontalPadding
import com.pocket.mypocket.ui.screens.common.CommonPagesTitleSize
import com.pocket.mypocket.ui.screens.common.CommonTopPadding
import com.pocket.mypocket.ui.screens.common.VerticalSpacer
import com.pocket.mypocket.ui.theme.Black2222
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun ChartScreen(navHostController: NavHostController) {
    ChartScreen()
}

@Composable
fun ChartScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(top = CommonTopPadding)
            .padding(horizontal = CommonPagesHorizontalPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(R.string.chart_title),
            style = regularStyle.copy(
                fontSize = CommonPagesTitleSize,
                fontWeight = FontWeight.SemiBold,
                color = Black2222
            )
        )

        VerticalSpacer(30.dp)

        ChartDatePeriodTabs()
    }
}

@Preview
@Composable
private fun PreviewChartScreen() {
    ChartScreen()
}