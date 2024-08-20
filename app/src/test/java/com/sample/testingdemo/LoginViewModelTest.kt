package com.sample.testingdemo

import io.mockk.coEvery
import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.advanceUntilIdle
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.After
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

@OptIn(ExperimentalCoroutinesApi::class)
class LoginViewModelTest {

    private val repository: LoginRepository = mockk()
    private lateinit var subject: LoginViewModel


    @Before
    fun setup() {
        subject = LoginViewModel(repository)
        Dispatchers.setMain(StandardTestDispatcher())
    }

    @After
    fun tearDown() {
        Dispatchers.resetMain() // Reset the Main dispatcher to its original state
    }

    @Test
    fun testLoginSuccess() = runTest {

        coEvery { repository.login("admin", "password") } returns flow {
            emit(Result.success(true))
        }

        subject.login("admin", "password")
        advanceUntilIdle()
        val state = subject.loginState.value
        assertEquals(true, state.isSuccess)
        coVerify { repository.login("admin", "password") }
    }

    @Test
    fun testLoginFailure() = runTest() {
        // Given
        coEvery { repository.login("admin", "wrongpassword") } returns flow {
            emit(Result.success(false))
        }

        // When
        subject.login("admin", "wrongpassword")
        advanceUntilIdle()
        // Then
        val state = subject.loginState.value
        assertEquals(false, state.isSuccess)
        coVerify { repository.login("admin", "wrongpassword") }
    }
}