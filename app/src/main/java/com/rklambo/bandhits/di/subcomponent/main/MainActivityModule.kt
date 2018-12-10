package com.rklambo.bandhits.di.subcomponent.main

import com.rklambo.bandhits.di.ActivityModule
import com.rklambo.bandhits.di.scope.ActivityScope
import com.rklambo.bandhits.domain.interactor.GetRecommendedArtistsInteractor
import com.rklambo.bandhits.domain.interactor.base.Bus
import com.rklambo.bandhits.domain.interactor.base.InteractorExecutor
import com.rklambo.bandhits.ui.adapter.ImageTitleAdapter
import com.rklambo.bandhits.ui.entity.mapper.ImageTitleDataMapper
import com.rklambo.bandhits.ui.presenter.MainPresenter
import com.rklambo.bandhits.ui.screens.main.MainActivity
import com.rklambo.bandhits.ui.view.MainView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule(activity: MainActivity) : ActivityModule(activity) {

    @Provides @ActivityScope
    fun provideMainView(): MainView = activity as MainView

    @Provides @ActivityScope
    fun provideImageTitleMapper() = ImageTitleDataMapper()

    @Provides @ActivityScope
    fun provideMainPresenter(view: MainView, bus: Bus,
                             recommendedArtistsInteractor: GetRecommendedArtistsInteractor,
                             interactorExecutor: InteractorExecutor,
                             imageMapper: ImageTitleDataMapper) = MainPresenter(view, bus, recommendedArtistsInteractor,
            interactorExecutor, imageMapper)
}