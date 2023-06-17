package com.example.myinventor

import android.content.Intent
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.myinventor.model.Inventor
import com.example.myinventor.ui.theme.MyInventorTheme

class DetailedActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val data : Inventor? = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            intent.getParcelableExtra<Inventor>(DATA, Inventor::class.java)
        } else {
            intent.getParcelableExtra<Inventor>(DATA)
        }

        setContent {
            MyInventorTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    DetailedApp(inventor = data)
                }
            }
        }
    }

    companion object{
        const val DATA = "data"
    }
}