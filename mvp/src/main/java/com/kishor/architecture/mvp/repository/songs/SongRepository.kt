package com.kishor.architecture.mvp.repository.songs

import com.kishor.architecture.mvp.presenter.songs.Song

interface SongRepository {
    fun loadSongs(): Song
}
