package com.camachoyury.ekkomerce

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.camachoyury.ekkomerce.ui.theme.ComposeTheme

@Composable
fun App() {
    ComposeTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            GreetingView(Greeting().greet())
        }
    }

}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}