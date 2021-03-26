package com.kishor.architecture.mvp.ui

import com.kishor.architecture.mvp.di.DependencyInjector
import com.kishor.architecture.mvp.presenter.Song
import com.kishor.architecture.mvp.presenter.SongScreenContract
import com.kishor.architecture.mvp.repository.SongRepository

class SongPresenter(view: SongScreenContract.View,
                    dependencyInjector: DependencyInjector) : SongScreenContract.Presenter {

    private val songRepository: SongRepository = dependencyInjector.songRepository()

    private var view: SongScreenContract.View? = view

    override fun onViewCreated() {
        loadSongs()
    }

    override fun onSongTapped() {
        loadSongs()
    }

    override fun onDestroy() {
        this.view = null
    }

    private fun loadSongs() {
        val song = songRepository.loadSongs()
        val songState = songStateForSongScreen(song)

        view?.displaySongsState(songState)
    }

    private fun songStateForSongScreen(song: Song): SongState {
        return SongState(song.raag, song.name)
    }
}
