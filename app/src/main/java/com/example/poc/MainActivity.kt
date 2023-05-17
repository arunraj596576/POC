package com.example.poc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.mylibrary.ImagePreview
import com.example.poc.ui.theme.AndroidLibraryTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setContent {
            AndroidLibraryTheme {
                Box(modifier = Modifier.fillMaxSize()) {
                    ImagePreview(image = painterResource(id = R.drawable.kermit),
                    description = "POC Sample ImageView",
                    modifier = Modifier
                        .align(Alignment.Center)
                        .size(150.dp))
                }
            }
        }
    }
}