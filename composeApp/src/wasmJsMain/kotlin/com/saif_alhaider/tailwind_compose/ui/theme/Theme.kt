package com.saif_alhaider.tailwind_compose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf


private val localColorScheme = staticCompositionLocalOf { ColorPalette() }
private val localDimension = staticCompositionLocalOf { Dimensions() }

@Composable
fun TailwindTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        localColorScheme provides ColorPalette(),
    ) {
        content()
    }
}

object Theme {
    val colors: ColorPalette
        @Composable
        @ReadOnlyComposable
        get() = localColorScheme.current

    val dimensions: Dimensions
        @Composable
        @ReadOnlyComposable
        get() = localDimension.current
}