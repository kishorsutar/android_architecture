package com.kishor.architecture.mvp.di

import com.kishor.architecture.mvp.repository.songs.SongRepository
import com.kishor.architecture.mvp.repository.songs.SongsRepositoryImpl

class DependencyInjectorImpl : DependencyInjector {

    override fun songRepository(): SongRepository {
        return SongsRepositoryImpl()
    }
}
