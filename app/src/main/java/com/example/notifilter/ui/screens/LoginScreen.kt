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
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountBox
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.notifilter.ui.theme.Black
import com.example.notifilter.ui.theme.NotifilterTheme

@Composable
fun LoginScreen(){
    Surface() {
        Column(modifier = Modifier.fillMaxSize()) {
//        val uiColor = if(isSystemInDarkTheme()) Color.White else Black
            Box(
                contentAlignment = Alignment.TopStart
            ) {
                Icon(
                    Icons.Rounded.AccountBox,
                    contentDescription = null,
                    modifier = Modifier.size(64.dp)
                )
            }
            Column(modifier = Modifier.fillMaxSize().padding(30.dp)){

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoginScreen()
}
