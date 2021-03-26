package com.kishor.architecture.mvp.repository

import com.kishor.architecture.mvp.presenter.Song

interface SongRepository {
    fun loadSongs(): Song
}
