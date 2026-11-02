package com.queen.assistant.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val QueenColors = darkColorScheme(
    primary = Color(0xFF00D9FF),
    secondary = Color(0xFFB45CFF),
    tertiary = Color(0xFFFF4DB8),
    background = Color(0xFF050817),
    surface = Color(0xFF10152B),
    onPrimary = Color.Black,
    onBackground = Color.White,
    onSurface = Color.White
)

@Composable
fun QueenTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = QueenColors,
        content = content
    )
}
