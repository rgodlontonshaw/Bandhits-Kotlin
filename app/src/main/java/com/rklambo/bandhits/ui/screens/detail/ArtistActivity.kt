package com.rklambo.bandhits.ui.screens.detail

import android.annotation.SuppressLint
import android.graphics.drawable.BitmapDrawable
import android.os.Bundle
import android.support.annotation.VisibleForTesting
import android.support.v7.graphics.Palette
import android.view.MenuItem
import android.view.WindowManager
import com.rklambo.bandhits.R
import com.rklambo.bandhits.di.ApplicationComponent
import com.rklambo.bandhits.di.subcomponent.detail.ArtistActivityModule
import com.rklambo.bandhits.ui.activity.BaseActivity
import com.rklambo.bandhits.ui.adapter.ArtistDetailPagerAdapter
import com.rklambo.bandhits.ui.entity.ArtistDetail
import com.rklambo.bandhits.ui.entity.ImageTitle
import com.rklambo.bandhits.ui.fragment.AlbumsFragmentContainer
import com.rklambo.bandhits.ui.presenter.AlbumsPresenter
import com.rklambo.bandhits.ui.presenter.ArtistPresenter
import com.rklambo.bandhits.ui.screens.album.AlbumActivity
import com.rklambo.bandhits.ui.util.getNavigationId
import com.rklambo.bandhits.ui.util.navigate
import com.rklambo.bandhits.ui.util.supportsLollipop
import com.rklambo.bandhits.ui.view.ArtistView
import com.squareup.picasso.Callback
import com.squareup.picasso.Picasso
import javax.inject.Inject

class ArtistActivity : BaseActivity<ArtistLayout>(), ArtistView, AlbumsFragmentContainer {

    override val ui = ArtistLayout()

    @Inject @VisibleForTesting
    lateinit var presenter: ArtistPresenter

    @Inject
    lateinit var picasso: Picasso

    @Inject
    lateinit var biographyFragment: BiographyFragment

    @Inject
    lateinit var albumsFragment: AlbumsFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setUpTransition()
        setUpTopBar()
        setUpViewPager()
        setUpTabLayout()
    }

    override fun injectDependencies(applicationComponent: ApplicationComponent) {
        applicationComponent.plus(ArtistActivityModule(this))
                .injectTo(this)
    }

    @SuppressLint("NewApi")
    private fun setUpTransition() {
        supportPostponeEnterTransition()
        supportsLollipop { ui.image.transitionName = IMAGE_TRANSITION_NAME }
    }

    private fun setUpTopBar() {
        title = null
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setUpTabLayout() {
        ui.tabLayout.setupWithViewPager(ui.viewPager)
    }

    private fun setUpViewPager() {
        val artistDetailPagerAdapter = ArtistDetailPagerAdapter(supportFragmentManager)
        artistDetailPagerAdapter.addFragment(biographyFragment, resources.getString(R.string.bio_fragment_title))
        artistDetailPagerAdapter.addFragment(albumsFragment, resources.getString(R.string.albums_fragment_title))
        ui.viewPager.adapter = artistDetailPagerAdapter
    }

    override fun onResume() {
        super.onResume()
        presenter.onResume()
        presenter.init(getNavigationId())
    }

    override fun onPause() {
        super.onPause()
        presenter.onPause()
    }

    override fun showArtist(artistDetail: ArtistDetail) {
        picasso.load(artistDetail.url).fit().centerCrop().into(ui.image, object : Callback.EmptyCallback() {
            override fun onSuccess() {
                makeStatusBarTransparent()
                supportStartPostponedEnterTransition()
                setActionBarTitle(artistDetail.name)
                biographyFragment.setBiographyText(artistDetail.bio)
                setActionBarPalette()
            }
        })
    }

    override fun showAlbums(albums: List<ImageTitle>) {
        albumsFragment.showAlbums(albums)
    }

    private fun setActionBarTitle(title: String) {
        supportActionBar?.title = title
    }

    private fun makeStatusBarTransparent() {
        supportsLollipop {
            window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        }
    }

    private fun setActionBarPalette() {
        val drawable = ui.image.drawable as BitmapDrawable?
        val bitmap = drawable?.bitmap
        if (bitmap != null) {
            Palette.from(bitmap).generate { palette ->
                val darkVibrantColor = palette.getDarkVibrantColor(R.attr.colorPrimary)
                ui.collapsingToolbarLayout.setContentScrimColor(darkVibrantColor)
                ui.collapsingToolbarLayout.setStatusBarScrimColor(darkVibrantColor)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item != null && item.itemId == android.R.id.home) {
            supportFinishAfterTransition()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

    override fun navigateToAlbum(albumId: String) {
        val view = albumsFragment.findViewByItemId(albumId)
        navigate<AlbumActivity>(albumId, view, BaseActivity.IMAGE_TRANSITION_NAME)
    }

    override fun getAlbumsPresenter(): AlbumsPresenter {
        return presenter
    }
}
