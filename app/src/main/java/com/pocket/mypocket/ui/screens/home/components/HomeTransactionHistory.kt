package com.pocket.mypocket.ui.screens.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.R
import com.pocket.mypocket.ui.screens.common.TransactionItem
import com.pocket.mypocket.ui.screens.common.VerticalSpacer
import com.pocket.mypocket.ui.theme.Black2222
import com.pocket.mypocket.ui.theme.Black6666
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
        ) {
            items(10) {
                TransactionItem(
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
