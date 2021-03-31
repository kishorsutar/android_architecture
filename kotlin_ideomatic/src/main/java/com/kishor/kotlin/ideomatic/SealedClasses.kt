package com.kishor.kotlin.ideomatic

sealed class Result<out T : Any> {
    data class Success<out T : Any>(val data: T) : Result<T>()
    sealed class Error(val exception: Exception) : Result<Nothing>() {
        class RecoverableError(exception: Exception) : Error(exception)
        class NonRecoverableError(exception: Exception) : Error(exception)
    }

    object InProgress : Result<Nothing>()
}

fun handleResult(result: Result<Int>) {
    when (result) {
        is Result.Success -> {
        }
        is Result.InProgress -> {
        }
        is Result.Error.NonRecoverableError -> TODO()
        is Result.Error.RecoverableError -> TODO()
    }.exhaustive
}

val <T> T.exhaustive: T
    get() = this
