package com.canpurcek.rushroyaldecks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.canpurcek.rushroyaldecks.ui.theme.RushRoyalDecksTheme
import com.canpurcek.rushroyaldecks.view.Clans
import com.canpurcek.rushroyaldecks.view.Decks
import com.canpurcek.rushroyaldecks.view.Feed
import com.canpurcek.rushroyaldecks.view.Profile
import com.google.accompanist.navigation.animation.AnimatedNavHost
import com.google.accompanist.navigation.animation.composable
import com.google.accompanist.navigation.animation.rememberAnimatedNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RushRoyalDecksTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    MainNavigation()
                }
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun MainNavigation() {
    val navController = rememberAnimatedNavController()

    AnimatedNavHost(navController, startDestination = "feed" ){


        composable("feed",
            enterTransition ={
                fadeIn(
                    // Overwrites the initial value of alpha to 0.4f for fade in, 0 by default
                    initialAlpha = 0.4f,animationSpec = tween(durationMillis = 800)
                )
            }, exitTransition  ={
                fadeOut(
                    // Overwrites the default animation with tween
                    animationSpec = tween(durationMillis = 600)
                )
            }
        ){
            Feed(navController)
        }

        composable("decks",
            enterTransition ={
                fadeIn(
                    // Overwrites the initial value of alpha to 0.4f for fade in, 0 by default
                    initialAlpha = 0.4f,animationSpec = tween(durationMillis = 800)
                )
            }, exitTransition  ={
                fadeOut(
                    // Overwrites the default animation with tween
                    animationSpec = tween(durationMillis = 600)
                )
            }
        ){
            Decks(navController)
        }


        composable("clans",
            enterTransition ={
                fadeIn(
                    // Overwrites the initial value of alpha to 0.4f for fade in, 0 by default
                    initialAlpha = 0.4f,animationSpec = tween(durationMillis = 800)
                )
            }, exitTransition  ={
                fadeOut(
                    // Overwrites the default animation with tween
                    animationSpec = tween(durationMillis = 600)
                )
            })
        {
            Clans(navController)

        }

        composable("profile",
            enterTransition ={
                fadeIn(
                    // Overwrites the initial value of alpha to 0.4f for fade in, 0 by default
                    initialAlpha = 0.4f,animationSpec = tween(durationMillis = 800)
                )
            }, exitTransition  ={
                fadeOut(
                    // Overwrites the default animation with tween
                    animationSpec = tween(durationMillis = 600)
                )
            })
        {
            Profile(navController)

        }


    }
}