package com.sample.testingdemo

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.test.ext.junit.runners.AndroidJUnit4
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import javax.inject.Inject


@HiltAndroidTest
@RunWith(AndroidJUnit4::class)
class LoginScreenTest {
    @get:Rule(order = 0)
    var hiltRule = HiltAndroidRule(this)
    @get:Rule(order = 1)
    val composeTestRule = createComposeRule()

    @Inject
    lateinit var repository: LoginRepository

    private lateinit var viewModel: LoginViewModel

    @Before
    fun init() {
        hiltRule.inject()
        viewModel = LoginViewModel(repository)
    }
    @Test
    fun loginScreenDisplays() {
        composeTestRule.setContent {
            LoginScreen(viewModel)
        }
        composeTestRule.onNodeWithText("Username").assertExists()
        composeTestRule.onNodeWithText("Password").assertExists()
        composeTestRule.onNodeWithText("Login").assertExists()
    }

    @Test
    fun loginSuccessful() {
        composeTestRule.setContent {
            LoginScreen(viewModel)
        }

        composeTestRule.onNodeWithText("Username").performTextInput("admin")
        composeTestRule.onNodeWithText("Password").performTextInput("password")
        composeTestRule.onNodeWithText("Login").performClick()
        composeTestRule.waitForIdle()
        composeTestRule.onNodeWithText("Login Successful").assertExists()
    }
}