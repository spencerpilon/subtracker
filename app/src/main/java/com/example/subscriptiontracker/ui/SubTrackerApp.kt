package com.example.subscriptiontracker.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.tooling.preview.PreviewFontScale
import androidx.compose.ui.tooling.preview.PreviewLightDark
import androidx.compose.ui.unit.dp
import com.example.subscriptiontracker.ui.theme.SubscriptionTrackerTheme

@PreviewLightDark
@PreviewFontScale
@Composable
fun SubTrackerApp(bottomBar: @Composable () -> Unit = {}) {
    //TODO: Add data
    SubscriptionTrackerTheme {
        Scaffold(
            floatingActionButton = { AddSubFab() },
            topBar = { SubTrackerTopBar() },
            bottomBar = bottomBar,
        ) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
                    .padding(start = 16.dp, end = 16.dp)
                    .consumeWindowInsets(it),
                content = {}
            )
        }
    }
}

@Composable
private fun AddSubFab() {
    FloatingActionButton(onClick = { /*TODO*/ }, content = {
        Icon(Icons.Filled.Add, "Add")
    })
}

@PreviewLightDark
@Composable
@OptIn(ExperimentalMaterial3Api::class)
private fun SubTrackerTopBar() {
    val shape: Shape = MaterialTheme.shapes.small.copy(
        topStart = CornerSize(0.dp),
        topEnd = CornerSize(0.dp)
    )
    Surface(
        shadowElevation = 10.dp,
        tonalElevation = 1.dp,
        shape = shape,
    ) {
        TopAppBar(title = { Text("Subscription Tracker") })
    }
}

@PreviewLightDark
@Composable
fun SubTrackerBottomBar() {
    val shape: Shape = MaterialTheme.shapes.extraLarge.copy(
        bottomStart = CornerSize(0.dp),
        bottomEnd = CornerSize(0.dp)
    )
    Surface(
        shadowElevation = 10.dp,
        tonalElevation = 1.dp,
        shape = shape,
    ) {
        BottomAppBar(
            contentPadding = PaddingValues(top = 8.dp, bottom = 8.dp, start = 20.dp, end = 20.dp),
            content = { Text(text = "Bottom Bar") }
        )
    }
}
