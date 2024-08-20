package com.sample.testingdemo

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class LoginRepository @Inject constructor(){
    open fun login(username: String, password: String): Flow<Result<Boolean>> = flow {
        emit(Result.success(username == "admin" && password == "password"))
    }
}