package me.bhavenshah.daggerhilt.di.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import me.bhavenshah.daggerhilt.ui.topheadline.TopHeadlineAdapter

@Module
@InstallIn(ActivityComponent::class)
class ActivityModule {

    @Provides
    fun provideTopHeadlineAdapter() = TopHeadlineAdapter(ArrayList())

}