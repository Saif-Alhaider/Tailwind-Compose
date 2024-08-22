package com.saif_alhaider.tailwind_compose.ui.buttons.iconButton

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import com.saif_alhaider.tailwind_compose.ui.buttons.TailwindButton
import com.saif_alhaider.tailwind_compose.ui.theme.TailwindTheme

@Composable
fun TailwindIconButton(
    painter: Painter,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    contentColor: Color = TailwindTheme.colors.black,
    backgroundColorOnHover: Color = TailwindTheme.colors.transparent,
    contentDescription: String? = null
) {
    TailwindButton(
        modifier = modifier,
        backgroundColor = TailwindTheme.colors.transparent,
        backgroundColorOnHover = backgroundColorOnHover,
        onClick = onClick,
        borderRadius = RoundedCornerShape(TailwindTheme.dimensions.radius.normal)
    ) {
        Image(
            painter = painter,
            contentDescription = contentDescription,
            colorFilter = ColorFilter.tint(contentColor)
        )
    }
}

@Composable
fun TailwindIconButton(
    iconProperties: IconProperties
) {
    iconProperties.run {
        TailwindButton(
            modifier = modifier.size(size),
            backgroundColor = TailwindTheme.colors.transparent,
            backgroundColorOnHover = backgroundColorOnHover,
            onClick = onClick ?: {},
            borderRadius = RoundedCornerShape(TailwindTheme.dimensions.radius.normal),
            contentAlignment = Alignment.Center,
            contentPadding = PaddingValues(TailwindTheme.dimensions.padding.none),
            isEnabled = isEnabled
        ) {
            Image(
                painter = painter,
                contentDescription = contentDescription,
                colorFilter = ColorFilter.tint(contentColor),
                alignment = Alignment.Center,
                modifier = Modifier.fillMaxSize()
            )
        }
    }

}

