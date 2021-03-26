package com.kishor.architecture.mvp.repository

import com.kishor.architecture.mvp.presenter.Song

class SongsRepositoryImpl : SongRepository {
    override fun loadSongs(): Song {
        return Song("Chup ke se", "Yaman")
    }
}
