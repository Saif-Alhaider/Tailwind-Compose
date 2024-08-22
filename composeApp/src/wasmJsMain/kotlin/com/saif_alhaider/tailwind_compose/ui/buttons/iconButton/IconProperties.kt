package com.saif_alhaider.tailwind_compose.ui.buttons.iconButton

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.Dp
import com.saif_alhaider.tailwind_compose.ui.theme.TailwindTheme

data class IconProperties(
    val painter: Painter,
    val onClick: (() -> Unit)? = null,
    val size: Dp = TailwindTheme.dimensions.size.size24,
    val modifier: Modifier = Modifier,
    val contentColor: Color = TailwindTheme.colors.black,
    val backgroundColorOnHover: Color = TailwindTheme.colors.transparent,
    val contentDescription: String? = null,
    val isEnabled: Boolean = true,
)
