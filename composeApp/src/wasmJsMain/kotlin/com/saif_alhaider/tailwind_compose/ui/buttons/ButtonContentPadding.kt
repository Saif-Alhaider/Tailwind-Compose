package com.saif_alhaider.tailwind_compose.ui.buttons

import androidx.compose.foundation.layout.PaddingValues
import com.saif_alhaider.tailwind_compose.ui.theme.TailwindTheme

internal object ButtonContentPadding {
    private val ButtonHorizontalPadding = TailwindTheme.dimensions.size.size8
    private val ButtonVerticalPadding = TailwindTheme.dimensions.size.size4

    val ContentPadding =
        PaddingValues(
            horizontal = ButtonHorizontalPadding,
            vertical = ButtonVerticalPadding
        )
}