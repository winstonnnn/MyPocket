package com.pocket.mypocket.ui.screens.onboarding

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.pocket.mypocket.R
import com.pocket.mypocket.ui.screens.common.HorizontalSpacer
import com.pocket.mypocket.ui.screens.common.PrimaryButton
import com.pocket.mypocket.ui.screens.common.VerticalSpacer
import com.pocket.mypocket.ui.theme.Black44
import com.pocket.mypocket.ui.theme.boldStyle
import com.pocket.mypocket.ui.theme.regularStyle

@Composable
fun OnBoardingScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.mipmap.onboarding_bg),
            contentScale = ContentScale.FillWidth,
            contentDescription = "Onboarding BG",
            modifier = Modifier
                .fillMaxWidth()
        )

        VerticalSpacer(.1f)

        Text(
            text = stringResource(R.string.onboarding_banner_text),
            style = boldStyle.copy(
                fontSize = 36.sp,
                color = MaterialTheme.colorScheme.primary,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.W800
            )
        )

        VerticalSpacer(.15f)

        PrimaryButton(
            text = stringResource(R.string.onboarding_get_started)
        ) {
            //TODO()
        }

        VerticalSpacer(.1f)

        Row {
            Text(
                text = stringResource(R.string.onboarding_login_text1),
                style = regularStyle.copy(
                    fontSize = 14.sp,
                    color = Black44
                )
            )

            HorizontalSpacer(5.dp)

            Text(
                text = stringResource(R.string.onboarding_login_text2),
                style = regularStyle.copy(
                    fontSize = 14.sp,
                    color = MaterialTheme.colorScheme.primary
                )
            )
        }
    }
}

@Preview
@Composable
private fun preview() {
    Surface { OnBoardingScreen() }

}