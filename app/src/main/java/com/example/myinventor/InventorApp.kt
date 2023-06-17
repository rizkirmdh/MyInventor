package com.example.myinventor

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.myinventor.model.Inventor
import com.example.myinventor.model.InventorData
import com.example.myinventor.ui.theme.MyInventorTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InventorApp (selectedInventor: (Inventor)->Unit, aboutClick: () -> Unit) {
    Column {
        TopAppBar(
            title = { Text(text = "MyInventor", Modifier.padding(horizontal = 8.dp))},
            navigationIcon = {
                IconButton(onClick = aboutClick) {
                    Icon(Icons.Filled.AccountCircle, "about_page", tint = Color.Black)
                }
            },
        )
        Divider(color = Color.Gray, thickness = 1.dp)
        LazyColumn {
            items(InventorData.inventors, key = { it.id }) { inventor ->
                Surface(modifier = Modifier.clickable { selectedInventor(inventor) }) {
                    InventorListItem(
                        name = inventor.name,
                        photoUrl = inventor.photoUrl,
                        modifier = Modifier.fillMaxWidth()
                    )
                }

            }
        }
    }
}

@Composable
fun InventorListItem(
    name: String,
    photoUrl: String,
    modifier: Modifier = Modifier
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
    ){
        AsyncImage(
            model = photoUrl,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(8.dp)
                .size(60.dp)
                .clip(CircleShape)
        )
        Text(
            text = name,
            fontWeight = FontWeight.Medium,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(start = 16.dp)
        )
    }
}

