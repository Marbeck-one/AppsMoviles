package com.example.appreparafacil_grupo8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.appreparafacil_grupo8.ui.HomeScreen
import com.example.appreparafacil_grupo8.ui.theme.AppReparaFacil_grupo8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppReparaFacil_grupo8Theme {
                HomeScreen()
            }
        }
    }
}