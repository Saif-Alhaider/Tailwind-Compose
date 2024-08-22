package com.saif_alhaider.tailwind_compose.ui.alert

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import com.saif_alhaider.tailwind_compose.ui.buttons.iconButton.IconProperties
import com.saif_alhaider.tailwind_compose.ui.buttons.iconButton.TailwindIconButton
import com.saif_alhaider.tailwind_compose.ui.theme.TailwindTheme

@Composable
fun TailwindAlert(
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues = PaddingValues(TailwindTheme.dimensions.size.size12),
    borderRadius: RoundedCornerShape = RoundedCornerShape(TailwindTheme.dimensions.radius.medium),
    title: @Composable () -> Unit,
    leadingIcon: IconProperties? = null,
    closeIcon: IconProperties? = null,
    backgroundColor: Color = TailwindTheme.colors.yellow50,
    content: @Composable () -> Unit,
    verticalSpaceBetween: Dp = TailwindTheme.dimensions.spaceBetween.xLarge,
    horizontalSpaceBetween: Dp = TailwindTheme.dimensions.spaceBetween.xLarge,
) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
            .clip(borderRadius)
            .background(backgroundColor)
            .padding(paddingValues)
            .height(IntrinsicSize.Max)
            .width(IntrinsicSize.Max)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            leadingIcon?.let { TailwindIconButton(it) }
            Spacer(Modifier.width(horizontalSpaceBetween))
            title()
            Spacer(Modifier.weight(1f))
            closeIcon?.let { TailwindIconButton(it) }
        }
        Spacer(Modifier.height(verticalSpaceBetween))
        Row {
            leadingIcon?.run { Spacer(Modifier.width(size)) }
            Spacer(Modifier.width(horizontalSpaceBetween))
            content()
        }
    }
}