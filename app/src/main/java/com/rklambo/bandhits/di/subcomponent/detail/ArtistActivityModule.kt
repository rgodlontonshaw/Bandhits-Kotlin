package com.rklambo.bandhits.di.subcomponent.detail

import com.rklambo.bandhits.di.ActivityModule
import com.rklambo.bandhits.di.scope.ActivityScope
import com.rklambo.bandhits.domain.interactor.GetArtistDetailInteractor
import com.rklambo.bandhits.domain.interactor.GetTopAlbumsInteractor
import com.rklambo.bandhits.domain.interactor.base.Bus
import com.rklambo.bandhits.domain.interactor.base.InteractorExecutor
import com.rklambo.bandhits.ui.entity.mapper.ArtistDetailDataMapper
import com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper
import com.rklambo.bandhits.ui.presenter.ArtistPresenter
import com.rklambo.bandhits.ui.screens.detail.AlbumsFragment
import com.rklambo.bandhits.ui.screens.detail.ArtistActivity
import com.rklambo.bandhits.ui.screens.detail.BiographyFragment
import com.rklambo.bandhits.ui.view.ArtistView
import dagger.Module
import dagger.Provides

@Module
class ArtistActivityModule(activity: ArtistActivity) : ActivityModule(activity) {

    @Provides @ActivityScope
    fun provideArtistView(): ArtistView = activity as ArtistView

    @Provides @ActivityScope
    fun provideArtistDataMapper() = ArtistDetailDataMapper()

    @Provides @ActivityScope
    fun provideImageTitleDataMapper() = ImageTitleDataMapper()

    @Provides @ActivityScope
    fun provideActivityPresenter(view: ArtistView,
                                 bus: Bus,
                                 artistDetailInteractor: GetArtistDetailInteractor,
                                 topAlbumsInteractor: GetTopAlbumsInteractor,
                                 interactorExecutor: InteractorExecutor,
                                 detailDataMapper: ArtistDetailDataMapper,
                                 imageTitleDataMapper: ImageTitleDataMapper)
            = ArtistPresenter(view, bus, artistDetailInteractor, topAlbumsInteractor,
            interactorExecutor, detailDataMapper, imageTitleDataMapper)

    @Provides @ActivityScope
    fun provideAlbumsFragment() = AlbumsFragment()

    @Provides @ActivityScope
    fun provideBiographyFragment() = BiographyFragment()
}