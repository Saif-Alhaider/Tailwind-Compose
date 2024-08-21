package com.saif_alhaider.tailwind_compose.ui.sequenceText

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.sp
import com.saif_alhaider.tailwind_compose.ui.theme.TailwindTheme

@Composable
fun BulletPointList(
    texts: List<String>,
    modifier: Modifier = Modifier,
    bulletColor: Color = TailwindTheme.colors.red800,
    bulletSize: Dp = TailwindTheme.dimensions.size.size8,
    horizontalSpaceBy: Dp = TailwindTheme.dimensions.spaceBetween.twoXLarge,
    verticalSpaceBy: Dp = TailwindTheme.dimensions.spaceBetween.twoXLarge,
    textStyle: TextStyle = TextStyle(color = TailwindTheme.colors.black, fontSize = 16.sp)
) {
    Column(modifier, verticalArrangement = Arrangement.spacedBy(verticalSpaceBy)) {
        texts.forEach {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(horizontalSpaceBy)
            ) {
                Spacer(Modifier.size(bulletSize).clip(CircleShape).background(bulletColor))
                BasicText(it, style = textStyle)
            }
        }

    }

}