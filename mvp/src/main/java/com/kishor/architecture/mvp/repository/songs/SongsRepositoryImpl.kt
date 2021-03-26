package com.kishor.architecture.mvp.repository.songs

import com.kishor.architecture.mvp.presenter.songs.Song

class SongsRepositoryImpl : SongRepository {
    override fun loadSongs(): Song {
        return Song("Chup ke se", "Yaman")
    }
}
