package com.steleot.jetpackcompose.playground.compose.externallibraries

import androidx.compose.ui.test.junit4.createComposeRule
import com.steleot.jetpackcompose.playground.compose.theme.TestTheme
import org.junit.Rule
import org.junit.Test

class ComposeShimmerScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testComposeShimmerScreen() {
        composeTestRule.setContent {
            TestTheme {
                ComposeShimmerScreen()
            }
        }
        // todo
    }
}