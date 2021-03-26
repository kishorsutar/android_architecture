package com.kishor.architecture.mvp.presenter

import com.kishor.architecture.mvp.ui.BaseView
import com.kishor.architecture.mvp.ui.SongState

interface SongScreenContract {

    interface Presenter : BasePresenter {
        fun onViewCreated()
        fun onSongTapped()
    }

    interface View : BaseView<Presenter> {
        fun displaySongsState(songsState: SongState)
    }
}
