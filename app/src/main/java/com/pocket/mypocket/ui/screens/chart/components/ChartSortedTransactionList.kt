package com.pocket.mypocket.ui.screens.chart.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.R
import com.pocket.mypocket.ui.common.CashFlow
import com.pocket.mypocket.ui.screens.common.TransactionItem
import com.pocket.mypocket.ui.screens.common.VerticalSpacer
import com.pocket.mypocket.ui.theme.Black2222
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun ChartSortedTransactionList(
    transactionType: CashFlow,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = when(transactionType) {
                    CashFlow.EXPENSES -> stringResource(R.string.chart_top_expenses_label)
                    CashFlow.INCOME -> stringResource(R.string.chart_top_income_label)
                },
                style = regularStyle.copy(
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Black2222
                )
            )

            Image(
                painter = painterResource(R.mipmap.sort),
                contentDescription = "Sort List Icon",
                modifier = Modifier.size(21.dp)
            )
        }

        VerticalSpacer(20.dp)

        //TODO(transaction history)
        LazyColumn {
            items(20) {
                TransactionItem(
                    "Starbucks",
                    "Yesterday",
                    false,
                    200.00
                )

                VerticalSpacer(16.dp)
            }
        }
    }
}