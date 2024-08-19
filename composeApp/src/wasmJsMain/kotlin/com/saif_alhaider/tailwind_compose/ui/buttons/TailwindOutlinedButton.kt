package com.saif_alhaider.tailwind_compose.ui.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.saif_alhaider.tailwind_compose.ui.theme.TailwindTheme

@Composable
fun TailwindOutlinedButton(
    borderStroke: BorderStroke = BorderStroke(
        width = TailwindTheme.dimensions.stroke.small,
        color = TailwindTheme.colors.blue500
    ),
    onClick: () -> Unit,
    isEnabled: Boolean = true,
    modifier: Modifier = Modifier,
    borderRadius: RoundedCornerShape = RoundedCornerShape(TailwindTheme.dimensions.radius.normal),
    contentPadding: PaddingValues = ButtonContentPadding.ContentPadding,
    contentAlignment: Alignment = Alignment.TopStart,
    content: @Composable RowScope.() -> Unit,
) {
    TailwindButton(
        backgroundColor = TailwindTheme.colors.transparent,
        backgroundColorOnHover = TailwindTheme.colors.transparent,
        onClick = onClick,
        isEnabled = isEnabled,
        modifier = modifier,
        borderRadius = borderRadius,
        contentPadding = contentPadding,
        contentAlignment = contentAlignment,
        borderStroke = borderStroke,
        content = content
    )
}