package com.saif_alhaider.tailwind_compose.ui.buttons

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerEventType
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.onPointerEvent
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.role
import androidx.compose.ui.semantics.semantics
import com.saif_alhaider.tailwind_compose.ui.theme.TailwindTheme


@Composable
fun TailwindButton(
    backgroundColor: Color = TailwindTheme.colors.blue500,
    backgroundColorOnHover: Color = TailwindTheme.colors.blue500,
    onClick: () -> Unit,
    isEnabled: Boolean = true,
    modifier: Modifier = Modifier,
    borderRadius: RoundedCornerShape = RoundedCornerShape(TailwindTheme.dimensions.radius.normal),
    contentPadding: PaddingValues = ButtonContentPadding.ContentPadding,
    contentAlignment: Alignment = Alignment.TopStart,
    borderStroke: BorderStroke? = null,
    content: @Composable RowScope.() -> Unit,
) {
    Box(
        modifier = modifier.tailwindButton(
            backgroundColor = backgroundColor,
            backgroundColorOnHover = backgroundColorOnHover,
            onClick = onClick,
            isEnabled = isEnabled,
            borderRadius = borderRadius,
            borderStroke = borderStroke
        ),
        contentAlignment = contentAlignment
    ) {
        Row(
            modifier = Modifier.defaultMinSize(
                minHeight = TailwindTheme.dimensions.size.size4,
                minWidth = TailwindTheme.dimensions.size.size8
            ).padding(contentPadding)
        ) {
            content()
        }
    }
}

@OptIn(ExperimentalComposeUiApi::class)
@Composable
private fun Modifier.tailwindButton(
    borderRadius: RoundedCornerShape,
    onClick: () -> Unit,
    isEnabled: Boolean,
    backgroundColor: Color,
    backgroundColorOnHover: Color,
    borderStroke: BorderStroke?
): Modifier {
    var isHovered by remember { mutableStateOf(false) }
    val bgColor = if (isHovered) backgroundColorOnHover else backgroundColor
    val border = tailwindBorder(borderStroke, borderRadius)
    return this
        .then(
            border
                .onPointerEvent(eventType = PointerEventType.Enter, onEvent = { isHovered = true })
                .onPointerEvent(eventType = PointerEventType.Exit, onEvent = { isHovered = false })
                .background(color = bgColor)
                .pointerHoverIcon(icon = if (isEnabled) PointerIcon.Hand else PointerIcon.Default)
                .clickable(
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                    onClick = onClick,
                    enabled = isEnabled,
                    role = Role.Button
                )
                .semantics { role = Role.Button }
        )
}

@Stable
private fun Modifier.tailwindBorder(borderStroke: BorderStroke?, borderRadius: RoundedCornerShape) =
    borderStroke?.run {
        border(width = width, brush = brush, shape = borderRadius)
    } ?: clip(shape = borderRadius)
