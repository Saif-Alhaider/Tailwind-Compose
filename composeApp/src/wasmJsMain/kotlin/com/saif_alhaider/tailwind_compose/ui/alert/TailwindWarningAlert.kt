package com.saif_alhaider.tailwind_compose.ui.alert

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.saif_alhaider.tailwind_compose.resources.Res
import com.saif_alhaider.tailwind_compose.resources.ic_solid_exclamation_triangle
import com.saif_alhaider.tailwind_compose.ui.buttons.iconButton.IconProperties
import com.saif_alhaider.tailwind_compose.ui.theme.TailwindTheme
import org.jetbrains.compose.resources.painterResource

@Composable
fun TailwindWarningAlert(
    modifier: Modifier = Modifier,
    title: @Composable () -> Unit,
    content: @Composable () -> Unit,

) {
    TailwindAlert(
        modifier = modifier,
        leadingIcon = IconProperties(
            painter = painterResource(Res.drawable.ic_solid_exclamation_triangle),
            contentColor = TailwindTheme.colors.yellow700Accent,
            size = TailwindTheme.dimensions.size.size20,
            isEnabled = false

        ),
        backgroundColor = TailwindTheme.colors.yellow50,
        paddingValues = PaddingValues(TailwindTheme.dimensions.padding.xLarge),
        title = title,
        content = content
    )
}