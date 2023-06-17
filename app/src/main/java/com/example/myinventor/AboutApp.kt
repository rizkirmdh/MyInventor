package com.example.myinventor

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage

@Composable
fun AboutApp(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        AsyncImage(
            model = "https://instagram.fkno3-1.fna.fbcdn.net/v/t51.2885-19/342570905_712494290629402_4660313950562457425_n.jpg?stp=dst-jpg_s320x320&_nc_ht=instagram.fkno3-1.fna.fbcdn.net&_nc_cat=110&_nc_ohc=A_8FMSeKL-4AX9TLDf-&edm=AOQ1c0wBAAAA&ccb=7-5&oh=00_AfB094p7ZVQd7G8e6SacYo-ZRS7VzxZy0VbQwHRmV0A2Hg&oe=6474111D&_nc_sid=f70a57",
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(200.dp)
                .clip(CircleShape)
        )

            Text(
                text = stringResource(id = R.string.me_name),
                textAlign = TextAlign.Center,
                fontSize = 24.sp,
                modifier = Modifier.padding(vertical = 32.dp)
            )

            Text(
                text = stringResource(id = R.string.me_email),
                textAlign = TextAlign.Center,
                fontSize = 20.sp
            )
        }
    }
}