package com.kishor.architecture.mvp.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.kishor.architecture.mvp.R
import com.kishor.architecture.mvp.di.DependencyInjectorImpl
import com.kishor.architecture.mvp.presenter.SongScreenContract
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(R.layout.activity_main), SongScreenContract.View {

    private lateinit var presenter: SongScreenContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setPresenter(SongPresenter(this, DependencyInjectorImpl()))
        presenter.onViewCreated()

        song_image.setOnClickListener { presenter.onSongTapped() }

    }

    override fun setPresenter(presenter: SongScreenContract.Presenter) {
        this.presenter = presenter
    }

    override fun onDestroy() {
        this.presenter.onDestroy()
        super.onDestroy()
    }

    override fun displaySongsState(songsState: SongState) {
        song_image.setImageResource(R.drawable.ic_launcher_background)
        song_detail.text = "${songsState.name} - ${songsState.raagName}"
    }
}
