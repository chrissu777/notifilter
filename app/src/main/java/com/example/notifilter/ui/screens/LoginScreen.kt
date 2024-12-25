package com.example.notifilter.ui.screens

import android.content.res.Configuration
import android.graphics.Paint.Align
import android.media.tv.TvContract
import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notifilter.R
import com.example.notifilter.ui.theme.NotifilterTheme
import com.example.notifilter.ui.theme.AppTypography

@Composable
fun LoginScreen() {
    NotifilterTheme {
        Surface() {
            Column(modifier = Modifier.fillMaxSize()) {
                val uiColor = if (isSystemInDarkTheme()) Color.White else Color.Black
//            Box(
//                contentAlignment = Alignment.TopStart
//            ) {
//                Icon(
//                    Icons.Rounded.AccountBox,
//                    contentDescription = null,
//                    modifier = Modifier.size(64.dp)
//                )
//            }
                Spacer(modifier = Modifier.padding(top = 90.dp))
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(30.dp)
                ) {
                    LoginSection()
                    Spacer(modifier = Modifier.height(25.dp))
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Row(modifier = Modifier.fillMaxWidth()) {
                            HorizontalDivider(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(0.5.dp)
                                    .align(alignment = Alignment.CenterVertically),
                                color = Color.Gray

                            )
                            Text(
                                modifier = Modifier.padding(horizontal = 8.dp),
                                text = "Or Continue With",
                                style = MaterialTheme.typography.labelMedium,
                            )
                            HorizontalDivider(
                                modifier = Modifier
                                    .weight(1f)
                                    .height(0.5.dp)
                                    .align(alignment = Alignment.CenterVertically),
                                color = Color.Gray
                            )
                        }
                        Spacer(modifier = Modifier.height(25.dp))
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            SocialMediaLogin(
                                R.drawable.google,
                                modifier = Modifier.weight(1f),
                                text = "Google"
                            ) {

                            }
                            Spacer(modifier = Modifier.width(20.dp))
                            SocialMediaLogin(
                                R.drawable.facebook,
                                modifier = Modifier.weight(1f),
                                text = "Facebook"
                            ) {

                            }
                        }
                    }
                }
            }
        }
    }
}

@Composable
private fun LoginSection() {
    Text(
        text = stringResource(id = R.string.login),
        style = MaterialTheme.typography.headlineLarge,
    )
    Text(
        text = stringResource(id = R.string.loginMessage),
        style = MaterialTheme.typography.labelSmall
    )
    Spacer(modifier = Modifier.height(10.dp))
    LoginTextField(Modifier.fillMaxWidth(), "Email", "")
    Spacer(modifier = Modifier.height(10.dp))
    LoginTextField(Modifier.fillMaxWidth(), "Password", "Forgot?")
    Spacer(modifier = Modifier.height(10.dp))

    Button(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp),
        onClick = {/*TODO*/ },
        shape = RoundedCornerShape(5.dp)
    ) {
        Text("Continue")
    }
}

@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "DefaultPreviewDark"
)
@Preview(
    uiMode = Configuration.UI_MODE_NIGHT_NO,
    name = "DefaultPreviewLight"
)

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginScreen()
}
