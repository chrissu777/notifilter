package com.example.notifilter.ui.screens

import android.media.tv.TvContract
import android.os.Bundle
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
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notifilter.R
import com.example.notifilter.ui.theme.NotifilterTheme
import com.example.notifilter.ui.theme.AppTypography

@Composable
fun LoginScreen() {
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
            Column(modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)) {
                Text(
                    text = stringResource(id = R.string.login),
                    style = MaterialTheme.typography.headlineLarge,
                )
                Text(
                    text = stringResource(id = R.string.loginMessage),
                    style = MaterialTheme.typography.labelSmall
                )
                LoginTextField(Modifier.fillMaxWidth(),"Email","Trailing")
                LoginTextField(Modifier.fillMaxWidth(),"Password","Forgot?")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginScreen()
}
