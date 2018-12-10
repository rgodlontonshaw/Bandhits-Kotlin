package com.rklambo.bandhits.di.subcomponent.album

import android.content.Context
import android.support.v7.widget.LinearLayoutManager
import com.rklambo.bandhits.di.ActivityModule
import com.rklambo.bandhits.di.scope.ActivityScope
import com.rklambo.bandhits.domain.interactor.GetAlbumDetailInteractor
import com.rklambo.bandhits.domain.interactor.base.Bus
import com.rklambo.bandhits.domain.interactor.base.InteractorExecutor
import com.rklambo.bandhits.ui.adapter.TracksAdapter
import com.rklambo.bandhits.ui.entity.mapper.AlbumDetailDataMapper
import com.rklambo.bandhits.ui.entity.mapper.TrackDataMapper
import com.rklambo.bandhits.ui.presenter.AlbumPresenter
import com.rklambo.bandhits.ui.screens.album.AlbumActivity
import com.rklambo.bandhits.ui.view.AlbumView
import dagger.Module
import dagger.Provides

@Module
class AlbumActivityModule(activity: AlbumActivity) : ActivityModule(activity) {

    @Provides @ActivityScope
    fun provideAlbumView(): AlbumView = activity as AlbumView

    @Provides @ActivityScope
    fun provideAlbumDataMapper() = AlbumDetailDataMapper()

    @Provides @ActivityScope
    fun provideTrackDataMapper() = TrackDataMapper()

    @Provides @ActivityScope
    fun provideLinearLayoutManager(context: Context) = LinearLayoutManager(context)

    @Provides @ActivityScope
    fun provideTracksAdapter() = TracksAdapter()

    @Provides @ActivityScope
    fun provideAlbumPresenter(view: AlbumView,
                              bus: Bus,
                              albumInteractor: GetAlbumDetailInteractor,
                              interactorExecutor: InteractorExecutor,
                              albumDetailDataMapper: AlbumDetailDataMapper)
            = AlbumPresenter(view, bus, albumInteractor,
            interactorExecutor, albumDetailDataMapper)
}