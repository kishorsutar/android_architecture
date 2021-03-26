package com.kishor.architecture.mvp.di

import com.kishor.architecture.mvp.repository.SongRepository

interface DependencyInjector {
    fun songRepository(): SongRepository
}
