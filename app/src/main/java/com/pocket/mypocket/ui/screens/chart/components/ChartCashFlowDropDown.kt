package com.pocket.mypocket.ui.screens.chart.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.sharp.KeyboardArrowDown
import androidx.compose.material.icons.sharp.KeyboardArrowUp
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.ui.common.CashFlow
import com.pocket.mypocket.ui.theme.Black6666
import com.pocket.mypocket.ui.theme.regularStyle
import com.pocket.mypocket.ui.utils.clickableNoRipple

@Composable
fun ChartCashFlowDropDown(
    modifier: Modifier = Modifier,
    onItemSelected: (selected: CashFlow) -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    var selectedCashFlow by remember { mutableStateOf(CashFlow.EXPENSES) }
    val items = CashFlow.entries

    Box(
        modifier = modifier
            .width(120.dp)
            .height(40.dp)
            .border(
                width = 1.dp,
                color = Black6666,
                shape = RoundedCornerShape(10.dp)
            )
            .clipToBounds(),
        contentAlignment = Alignment.Center
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickableNoRipple {
                    expanded = !expanded
                },
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = selectedCashFlow.cashFlowName,
                style = regularStyle.copy(
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    color = Black6666
                )
            )

            Icon(
                imageVector = if (expanded) {
                    Icons.Sharp.KeyboardArrowUp
                }else {
                    Icons.Sharp.KeyboardArrowDown
                },
                tint = Black6666,
                contentDescription = "Dropdown icon",
                modifier = Modifier.size(20.dp)
            )
        }


        DropdownMenu(
            expanded = expanded,
            modifier = Modifier
                .width(120.dp),
            offset = DpOffset(x = 0.dp, y = 5.dp),
            shape = RoundedCornerShape(10.dp),
            border = BorderStroke(
                width = 1.dp,
                color = Black6666
            ),
            containerColor = MaterialTheme.colorScheme.tertiary,
            onDismissRequest = {
                expanded = false
            }
        ) {
            items.forEach { cashFlow ->
                DropdownMenuItem(
                    onClick = {
                        onItemSelected(cashFlow)
                        selectedCashFlow = cashFlow
                        expanded = false
                    },
                    text = {
                        Text(
                            text = cashFlow.cashFlowName,
                            style = regularStyle.copy(
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                color = Black6666
                            )
                        )
                    }
                )
            }
        }
    }
}