package com.kishor.architecture.mvp.presenter.songs

import com.kishor.architecture.mvp.presenter.BasePresenter
import com.kishor.architecture.mvp.ui.BaseView
import com.kishor.architecture.mvp.ui.songs.SongState

interface SongScreenContract {

    interface Presenter : BasePresenter {
        fun onViewCreated()
        fun onSongTapped()
    }

    interface View : BaseView<Presenter> {
        fun displaySongsState(songsState: SongState)
    }
}
