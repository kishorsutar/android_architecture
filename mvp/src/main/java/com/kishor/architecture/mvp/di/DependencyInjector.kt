package com.kishor.architecture.mvp.di

import com.kishor.architecture.mvp.repository.songs.SongRepository

interface DependencyInjector {
    fun songRepository(): SongRepository
}
