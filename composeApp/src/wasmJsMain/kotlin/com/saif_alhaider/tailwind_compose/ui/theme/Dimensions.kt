package com.saif_alhaider.tailwind_compose.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Immutable
data class Dimensions(
    val size: Size = Size(),
    val radius: Radius = Radius(),
    val stroke: Stroke = Stroke()
)

@Immutable
data class Size(
    val size4: Dp = 4.dp,
    val size8: Dp = 8.dp,
    val size12: Dp = 12.dp,
    val size16: Dp = 16.dp,
    val size20: Dp = 20.dp,
    val size24: Dp = 24.dp,
    val size28: Dp = 28.dp,
    val size32: Dp = 32.dp,
    val size36: Dp = 36.dp,
    val size40: Dp = 40.dp,
    val size44: Dp = 44.dp,
    val size48: Dp = 48.dp,
    val size52: Dp = 52.dp,
    val size56: Dp = 56.dp,
    val size60: Dp = 60.dp,
    val size64: Dp = 64.dp,
    val size72: Dp = 72.dp,
    val size80: Dp = 80.dp,
    val size96: Dp = 96.dp,
    val size128: Dp = 128.dp,
    val size160: Dp = 160.dp,
    val size192: Dp = 192.dp,
    val size224: Dp = 224.dp,
    val size256: Dp = 256.dp
)

@Immutable
data class Radius(
    val none: Dp = 0.dp,
    val small: Dp = 2.dp,
    val normal: Dp = 4.dp,
    val medium: Dp = 6.dp,
    val large: Dp = 8.dp,
    val xLarge: Dp = 12.dp,
    val twoXLarge: Dp = 16.dp,
    val threeXLarge: Dp = 24.dp,
    val full: Dp = Int.MAX_VALUE.dp,
)

@Immutable
data class Stroke(
    val small: Dp = 2.dp,
    val medium: Dp = 4.dp,
    val large: Dp = 8.dp,
)