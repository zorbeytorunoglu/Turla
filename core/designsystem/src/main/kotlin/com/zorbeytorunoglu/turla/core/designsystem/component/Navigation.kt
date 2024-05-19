package com.zorbeytorunoglu.turla.core.designsystem.component

import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.NavigationRailItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun RowScope.TurlaNavigationBarItem(
    selected: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    alwaysShowLabel: Boolean = true,
    icon: @Composable () -> Unit,
    selectedIcon: @Composable () -> Unit,
    label: @Composable (() -> Unit)? = null
) {

    NavigationBarItem(
        selected = selected,
        onClick = onClick,
        icon = if (selected) selectedIcon else icon,
        modifier = modifier,
        enabled = enabled,
        label = label,
        alwaysShowLabel = alwaysShowLabel,
        colors = NavigationBarItemDefaults.colors(
            selectedIconColor = TurlaNavigationDefaults.navigationSelectedItemColor(),
            unselectedIconColor = TurlaNavigationDefaults.navigationContentColor(),
            selectedTextColor = TurlaNavigationDefaults.navigationSelectedItemColor(),
            unselectedTextColor = TurlaNavigationDefaults.navigationContentColor(),
            indicatorColor = TurlaNavigationDefaults.navigationIndicatorColor()
        )
    )

}

@Composable
fun TurlaNavigationBar(
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {

    NavigationBar(
        modifier = modifier,
        contentColor = TurlaNavigationDefaults.navigationContentColor(),
        tonalElevation = 0.dp,
        content = content
    )

}

@Composable
fun TurlaNavigationRailItem(
    selected: Boolean,
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    enabled: Boolean = true,
    alwaysShowLabel: Boolean = true,
    icon: @Composable () -> Unit,
    selectedIcon: @Composable () -> Unit,
    label: @Composable (() -> Unit)? = null
) {

    NavigationRailItem(
        selected = selected,
        onClick = onClick,
        icon = if (selected) selectedIcon else icon,
        modifier = modifier,
        enabled = enabled,
        label = label,
        alwaysShowLabel = alwaysShowLabel,
        colors = NavigationRailItemDefaults.colors(
            selectedIconColor = TurlaNavigationDefaults.navigationSelectedItemColor(),
            unselectedIconColor = TurlaNavigationDefaults.navigationContentColor(),
            selectedTextColor = TurlaNavigationDefaults.navigationSelectedItemColor(),
            unselectedTextColor = TurlaNavigationDefaults.navigationContentColor(),
            indicatorColor = TurlaNavigationDefaults.navigationIndicatorColor()
        )
    )

}

@Composable
fun TurlaNavigationRail(
    modifier: Modifier = Modifier,
    header: @Composable (ColumnScope.() -> Unit)? = null,
    content: @Composable ColumnScope.() -> Unit
) {

    NavigationRail(
        modifier = modifier,
        containerColor = Color.Transparent,
        contentColor = TurlaNavigationDefaults.navigationContentColor(),
        header = header,
        content = content
    )

}

object TurlaNavigationDefaults {
    @Composable
    fun navigationContentColor() = MaterialTheme.colorScheme.onSurfaceVariant
    @Composable
    fun navigationSelectedItemColor() = MaterialTheme.colorScheme.onPrimaryContainer
    @Composable
    fun navigationIndicatorColor() = MaterialTheme.colorScheme.primaryContainer
}