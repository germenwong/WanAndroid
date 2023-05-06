package com.hgm.wanandroid.ui.navigation


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hgm.wanandroid.ui.screen.LoginScreen

@Composable
fun NavHostApp() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.LoginScreen.route
    ) {
        //登录页
        composable(route = Screen.LoginScreen.route){
            LoginScreen()
        }

    }
}

sealed class Screen(val route: String) {
    object LoginScreen : Screen(route = "login")
    object HomeScreen : Screen(route = "home")
    object SortScreen : Screen(route = "sort")
    object SaveScreen : Screen(route = "save")
    object MineScreen : Screen(route = "mine")
}
