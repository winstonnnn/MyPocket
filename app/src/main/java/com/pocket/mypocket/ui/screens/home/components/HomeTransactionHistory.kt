package com.pocket.mypocket.ui.screens.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.R
import com.pocket.mypocket.ui.screens.common.HorizontalSpacer
import com.pocket.mypocket.ui.screens.common.VerticalSpacer
import com.pocket.mypocket.ui.theme.Black100
import com.pocket.mypocket.ui.theme.Black2222
import com.pocket.mypocket.ui.theme.Black6666
import com.pocket.mypocket.ui.theme.HomeTransactionItemDecreaseColor
import com.pocket.mypocket.ui.theme.HomeTransactionItemIconBG
import com.pocket.mypocket.ui.theme.HomeTransactionItemIncreaseColor
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun HomeTransactionHistory(
    modifier: Modifier = Modifier,
    onClickSeeAll: () -> Unit,
    onClickHistoryItem: () -> Unit
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = stringResource(R.string.home_transaction_history),
                style = regularStyle.copy(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Black2222
                )
            )

            Text(
                text = stringResource(R.string.home_transaction_see_all),
                style = regularStyle.copy(
                    fontSize = 14.sp,
                    color = Black6666
                ),
                modifier = Modifier
                    .clickable {
                        onClickSeeAll()
                    }
            )
        }

        VerticalSpacer(20.dp)

        LazyColumn(
            modifier = Modifier
                .padding(bottom = 50.dp)
        ) {
            items(10) {
                TransactionHistoryItem(
                    "Starbucks",
                    "Today",
                    false,
                    200.00
                )
                VerticalSpacer(16.dp)
            }
        }
    }
}

@Composable
private fun TransactionHistoryItem(
    transactionName: String,
    transactionDate: String,
    isIncome: Boolean,
    amount: Double,
    modifier: Modifier = Modifier
) {
    val transactionIcon: Painter
    val transactionColor: Color

    if (isIncome) {
        transactionIcon = painterResource(R.mipmap.cashflow_income)
        transactionColor = HomeTransactionItemIncreaseColor
    } else {
        transactionIcon = painterResource(R.mipmap.cashflow_expenses)
        transactionColor = HomeTransactionItemDecreaseColor
    }

    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(
                    color = HomeTransactionItemIconBG,
                    shape = RoundedCornerShape(8.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = transactionIcon,
                contentScale = ContentScale.FillBounds,
                contentDescription = "Cash flow icon",
                modifier = Modifier
                    .size(30.dp)
            )
        }

        Column {
            Text(
                text = transactionName,
                style = regularStyle.copy(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    color = Black100
                )
            )

            VerticalSpacer(3.dp)

            Text(
                text = transactionDate,
                style = regularStyle.copy(
                    fontSize = 13.sp,
                    color = Black6666
                )
            )
        }

        Spacer(Modifier.weight(1f))

        Text(
            "$ $amount",
            style = regularStyle.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                color = transactionColor
            )
        )
    }
}