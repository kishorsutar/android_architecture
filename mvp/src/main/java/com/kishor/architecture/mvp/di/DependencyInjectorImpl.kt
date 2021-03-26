package com.kishor.architecture.mvp.di

import com.kishor.architecture.mvp.repository.SongRepository
import com.kishor.architecture.mvp.repository.SongsRepositoryImpl

class DependencyInjectorImpl : DependencyInjector {

    override fun songRepository(): SongRepository {
        return SongsRepositoryImpl()
    }
}
