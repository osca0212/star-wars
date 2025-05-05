package com.example.apis_star_wars.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.material3.ColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = MoradoStarWars,
    secondary = VerdeStarWars,
    background = FondoOscuro,
    surface = FondoOscuro,
    onPrimary = TextoClaro,
    onSecondary = TextoClaro,
    onBackground = TextoClaro,
    onSurface = TextoClaro
)

private val LightColorScheme = lightColorScheme(
    primary = MoradoStarWars,
    secondary = VerdeStarWars,
    background = Color(0xFFF0F0F0),
    surface = Color(0xFFFFFFFF),
    onPrimary = Color.White,
    onSecondary = Color.Black,
    onBackground = Color.Black,
    onSurface = Color.Black
)

@Composable
fun Apis_Star_WarsTheme(
    darkTheme: Boolean = true,
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme: ColorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}
