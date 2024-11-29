package com.example.datastoreexemple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.datastoreexemple.ui.theme.DataStoreExempleTheme
import com.example.datastoreexemple.view.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DataStoreExempleTheme {
                LoginScreen()
            }
        }
    }
}

