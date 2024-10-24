package com.codewithfk.expensetracker.android.ui.theme

import androidx.compose.ui.graphics.Color

val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)
val Zinc = Color(0xFF2F7E79)
val LightGrey = Color(0xFF666666)
val Red = Color(0xFFFF0000)
val Green = Color(0xFF00FF00)

sealed class ThemeColors(
    val background: Color,
    val surface: Color,
    val primary: Color,
    val secondary: Color,
    val tertiary: Color,
    val text: Color
) {
    data object Night : ThemeColors(
        background = Color.White,
        surface = Color.White,
        primary = Zinc,
        secondary = PurpleGrey40,
        tertiary = Pink40,
        text = Color.Black
    )

    data object Day : ThemeColors(
        background = Color.White,
        surface = Color.White,
        primary = Zinc,
        secondary = PurpleGrey40,
        tertiary = Pink40,
        text = Color.Black
    )
}