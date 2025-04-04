package com.steleot.jetpackcompose.playground.compose.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
//noinspection UsingMaterialAndMaterial3Libraries
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalViewConfiguration
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.steleot.jetpackcompose.playground.resources.R
import com.steleot.jetpackcompose.playground.navigation.graph.UiNavRoutes
import com.steleot.jetpackcompose.playground.ui.base.material.DefaultScaffold

private const val URL = "ui/LocalViewConfigurationScreen.kt"

@Composable
fun LocalViewConfigurationScreen() {
    DefaultScaffold(
        title = UiNavRoutes.LocalViewConfiguration,
        link = URL,
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues = it)
                .padding(32.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LocalViewConfigurationExample()
        }
    }
}

@Composable
private fun LocalViewConfigurationExample() {
    val viewConfiguration = LocalViewConfiguration.current
    Text(
        text = stringResource(
            id = R.string.local_view_configuration,
            viewConfiguration.doubleTapMinTimeMillis,
            viewConfiguration.doubleTapTimeoutMillis,
            viewConfiguration.longPressTimeoutMillis,
            viewConfiguration.touchSlop
        )
    )
}