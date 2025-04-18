package com.steleot.jetpackcompose.playground.compose.material3

import androidx.compose.ui.test.junit4.createComposeRule
import com.steleot.jetpackcompose.playground.compose.theme.TestTheme3
import org.junit.Rule
import org.junit.Test

class MultiChoiceSegmentedButtonRowScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testMultiChoiceSegmentedButtonRowScreen() {
        composeTestRule.setContent {
            TestTheme3 {
                MultiChoiceSegmentedButtonRowScreen()
            }
        }
        // todo
    }
}