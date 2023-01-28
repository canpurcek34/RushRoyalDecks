package com.canpurcek.rushroyaldecks.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.canpurcek.rushroyaldecks.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Profile(navController: NavHostController) {


    Scaffold(
        topBar = {

            Row(
                modifier = Modifier
                    .padding(start = 10.dp, top = 10.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Card(
                    modifier = Modifier
                        .size(50.dp)
                        .align(Alignment.CenterVertically),
                    shape = CircleShape
                ) {
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = R.drawable.favicon),
                        contentDescription = "topbar icon"
                    )
                }


                Text(
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                        .padding(start = 10.dp),
                    text = "Rush Royal Decks",
                    style = MaterialTheme.typography.titleLarge
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.CenterVertically),
                    horizontalArrangement = Arrangement.End,
                ) {


                    Icon(
                        modifier = Modifier
                            .clickable {

                            }
                            .size(40.dp)
                            .padding(end = 10.dp),
                        imageVector = Icons.Default.Menu,
                        contentDescription = "menu icon",
                        tint = MaterialTheme.colorScheme.onSurface
                    )
                }
            }

        },
        bottomBar = {
            BottomNavigation(
                modifier = Modifier
                    .height(90.dp)
                    .padding(bottom = 10.dp, top = 10.dp)
                    .fillMaxWidth(),
                backgroundColor = MaterialTheme.colorScheme.surface,
                contentColor = MaterialTheme.colorScheme.onSurface
            ) {
                BottomNavigationItem(
                    icon = {
                        Image(
                            modifier = Modifier.size(40.dp),
                            painter = painterResource(id = R.drawable.feed),
                            contentDescription = "feed icon",
                        )
                    },
                    label = { Text(text = "Feed") },
                    selected = false,
                    onClick = {
                        navController.navigate("feed")
                    }
                )
                BottomNavigationItem(
                    icon = {
                        Image(
                            modifier = Modifier.size(40.dp),
                            painter = painterResource(id = R.drawable.decks),
                            contentDescription = "decks icon",
                        )
                    },
                    label = { Text(text = "Decks") },
                    selected = false,
                    onClick = {
                        navController.navigate("decks")
                    }
                )
                BottomNavigationItem(
                    icon = {
                        Image(
                            modifier = Modifier.size(40.dp),
                            painter = painterResource(id = R.drawable.clans),
                            contentDescription = "clans icon",
                        )
                    },
                    label = { Text(text = "Clans") },
                    selected = false,
                    onClick = {
                        navController.navigate("clans")
                    }
                )
                BottomNavigationItem(
                    icon = {
                        Image(
                            modifier = Modifier.size(40.dp),
                            painter = painterResource(id = R.drawable.prof),
                            contentDescription = "prof icon",
                        )
                    },
                    label = { Text(text = "Profile") },
                    selected = false,
                    onClick = {
                        navController.navigate("profile")
                    }
                )
            }

        },
        content = {
            Text(text = "Profile")

        }
    )
}