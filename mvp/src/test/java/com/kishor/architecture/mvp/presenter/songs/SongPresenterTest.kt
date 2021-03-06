package com.kishor.architecture.mvp.presenter.songs

import com.kishor.architecture.mvp.di.DependencyInjector
import com.kishor.architecture.mvp.repository.songs.SongRepository
import com.kishor.architecture.mvp.ui.songs.SongState
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.mock
import org.mockito.Mockito.verify

class SongPresenterTest {
    private var mockSongActivity: SongScreenContract.View =
        mock(SongScreenContract.View::class.java)
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
