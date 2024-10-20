package com.pocket.mypocket.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.R
import com.pocket.mypocket.ui.screens.common.HorizontalSpacer
import com.pocket.mypocket.ui.screens.common.VerticalSpacer
import com.pocket.mypocket.ui.theme.HomeCardBackground
import com.pocket.mypocket.ui.theme.HomeCashFlowLabelColor
import com.pocket.mypocket.ui.theme.White6
import com.pocket.mypocket.ui.theme.boldStyle
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun HomeCard(modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(
                color = HomeCardBackground,
                shape = RoundedCornerShape(20.dp)
            )
    ) {
        Column(
            modifier = Modifier
                .padding(vertical = 30.dp, horizontal = 20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(R.string.home_card_label_total_balance),
                    style = regularStyle.copy(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = MaterialTheme.colorScheme.tertiary
                    )
                )

                Image(
                    painter = painterResource(R.mipmap.common_3_dots_icon),
                    contentDescription = "3 dots icon",
                    modifier = Modifier.width(21.dp)
                )
            }

            VerticalSpacer(5.dp)

            Text(
                text = "$ 999,000",
                style = boldStyle.copy(
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = MaterialTheme.colorScheme.tertiary
                )
            )

            VerticalSpacer(30.dp)

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CashFlow(
                    icon = painterResource(R.mipmap.arrow_down),
                    label = stringResource(R.string.cash_flow_income),
                    amount = 300000.00,
                )

                CashFlow(
                    icon = painterResource(R.mipmap.arrow_up),
                    label = stringResource(R.string.cash_flow_expenses),
                    amount = 100000.00,
                )
            }
        }
    }
}

@Composable
private fun CashFlow(
    icon: Painter,
    label: String,
    amount: Double,
    modifier: Modifier = Modifier,
) {
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .background(
                        color = White6,
                        RoundedCornerShape(12.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = icon,
                    contentScale = ContentScale.Fit,
                    contentDescription = "Cash flow icon"
                )
            }

            HorizontalSpacer(3.dp)

            Text(
                text = label,
                style = regularStyle.copy(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = HomeCashFlowLabelColor
                )
            )
        }

        VerticalSpacer(5.dp)

        Text(
            text = "$ $amount",
            style = regularStyle.copy(
                fontSize = 22.sp,
                fontWeight = FontWeight.SemiBold,
                color = MaterialTheme.colorScheme.tertiary
            ),
            modifier = Modifier
                .padding(start = 5.dp)
        )
    }
}