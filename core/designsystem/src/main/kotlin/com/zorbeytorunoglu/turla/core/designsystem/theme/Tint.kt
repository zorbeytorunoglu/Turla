package com.zorbeytorunoglu.turla.core.designsystem.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

data class TintTheme(
    val iconTint: Color = Color.Unspecified
)

val LocalTintTheme = staticCompositionLocalOf { TintTheme() }