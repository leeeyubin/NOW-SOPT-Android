package com.sopt.feature.auth.login.navigation

import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.sopt.feature.auth.login.LoginRoute

fun NavController.loginNavigation(navOptions: NavOptions? = null) {
    navigate(
        route = Login.ROUTE,
        navOptions = navOptions
    )
}

fun NavGraphBuilder.loginGraph(
    popBackStack: () -> Unit,
    onSingUpClick: () -> Unit,
    onMainClick: () -> Unit,
    navHostController: NavHostController
) {
    composable(route = Login.ROUTE) {
        LoginRoute(
            popBackStack = popBackStack,
            onSignUpClick = onSingUpClick,
            onMainClick = onMainClick,
            navController = navHostController,
        )
    }
}

object Login {
    const val ROUTE = "LOGIN"
}