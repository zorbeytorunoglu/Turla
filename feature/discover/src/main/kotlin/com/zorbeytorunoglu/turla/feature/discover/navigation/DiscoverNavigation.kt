package com.zorbeytorunoglu.turla.feature.discover.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable

const val DISCOVER_ROUTE = "discover_route"

fun NavController.navigateToDiscover(navOptions: NavOptions) = navigate(route = DISCOVER_ROUTE, navOptions)

fun NavGraphBuilder.discoverScreen() {
    composable(
        route = DISCOVER_ROUTE
    ) {
        // TODO: DiscoverRoute
    }
}