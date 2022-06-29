@file:Suppress("unused")

package com.example.chuckorivan.di

import com.example.chuckorivan.interfaces.RepositoryInterface
import com.example.chuckorivan.network.Repository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun repository(repository: Repository): RepositoryInterface

}