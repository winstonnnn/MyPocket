package com.pocket.mypocket.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.R
import com.pocket.mypocket.ui.screens.common.CommonTopCurveBackground
import com.pocket.mypocket.ui.screens.common.VerticalSpacer
import com.pocket.mypocket.ui.screens.home.components.Greeting
import com.pocket.mypocket.ui.screens.home.components.HomeCard
import com.pocket.mypocket.ui.screens.home.components.HomeReloadButton
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxSize()
    ) {
        CommonTopCurveBackground()

        Column(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .padding(top = 74.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Greeting()
                HomeReloadButton()
            }

            VerticalSpacer(40.dp)

            HomeCard()
        }

    }
}



