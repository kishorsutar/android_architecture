package com.kishor.architecture.mvp.ui

interface BaseView<T> {
    fun setPresenter(presenter: T)
}
