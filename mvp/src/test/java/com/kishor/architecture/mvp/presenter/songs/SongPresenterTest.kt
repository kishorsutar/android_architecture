package com.kishor.architecture.mvp.presenter

import com.kishor.architecture.mvp.di.DependencyInjector
import com.kishor.architecture.mvp.presenter.songs.Song
import com.kishor.architecture.mvp.presenter.songs.SongScreenContract
import com.kishor.architecture.mvp.repository.songs.SongRepository
import com.kishor.architecture.mvp.ui.songs.SongPresenter
import com.kishor.architecture.mvp.ui.songs.SongState
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.verify
import org.junit.After
import org.junit.Before
import org.junit.Test

class SongPresenterTest {
    private var mockSongActivity: SongScreenContract.View = mock()
    private val dependencyInjector: DependencyInjector = StubDependencyInjector()
    private var presenter: SongPresenter? = null

    @Before
    fun setUp() {
        presenter = SongPresenter(mockSongActivity, dependencyInjector)
    }

    @After
    fun tearDown() {
        presenter?.onDestroy()
    }

    @Test
    fun `Given view is created verify songs state`() {
        // arrange
        presenter?.onViewCreated()

        //act and assert
        verify(mockSongActivity).displaySongsState(SongState("Chup ke se", "Yaman"))

    }

}

class StubDependencyInjector : DependencyInjector {
    override fun songRepository(): SongRepository {
        return StubSongRepository()
    }
}

class StubSongRepository : SongRepository {
    companion object {
        val SONG = Song("Chup ke se", "Yaman")
    }

    override fun loadSongs(): Song {
        return SONG
    }
}
