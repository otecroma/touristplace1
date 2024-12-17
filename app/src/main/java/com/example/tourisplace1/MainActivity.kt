package com.example.tourisplace1

import android.app.Application
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.tourisplace1.data.Destination
import com.example.tourisplace1.ui.navigation.Navigation
import com.example.tourisplace1.ui.theme.Tourisplace1Theme
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApp : Application()

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val destinations = listOf(
                Destination(1, "Kyiv", "Description of Kyiv", "https://img3.oastatic.com/img2/74434654/max/variant.jpg"),
                Destination(2, "Lviv", "Description of Lviv", "https://nccconline.org/storage/images/72176afdcb7dfd50cd51fef0f6c6dae3.jpg"),
                Destination(3, "Zhovkva", "Description of Zhovkva", "https://www.navigator-ukraina.com.ua/media/k2/items/cache/e024813b29ebd45d0ef447940e0ad5c1_XL.jpg")
                // Додайте інші туристичні місця
            )
            MaterialTheme {
                Navigation(destinations)
            }
        }
    }
}

