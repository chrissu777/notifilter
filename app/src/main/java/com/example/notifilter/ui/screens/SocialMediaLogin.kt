package com.example.notifilter.ui.screens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.notifilter.ui.theme.primaryDark

@Composable
fun SocialMediaLogin(
    @DrawableRes icon: Int,
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit

) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(5.dp))
            .socialMediaOutline()
            .clickable { onClick() }
            .height(40.dp),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = icon),
            contentDescription = null,
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(text = text, style = MaterialTheme.typography.labelMedium)
    }
}

fun Modifier.socialMediaOutline(): Modifier = composed {
    if (isSystemInDarkTheme()) {
        Modifier
            .background(Color.Transparent)
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(5.dp),
                color = primaryDark
            )
    } else {
        Modifier
            .background(Color(0xFFE0E2E8))
            .border(
                width = 0.5.dp,
                shape = RoundedCornerShape(5.dp),
                color = Color.Black
            )
    }
}