package com.example.home.baseapplication.di

import androidx.lifecycle.ViewModel
import com.example.home.baseapplication.FragmentOne
import com.example.home.baseapplication.FragmentThree
import com.example.home.baseapplication.FragmentTwo
import com.example.home.baseapplication.MainActivity
import com.example.home.baseapplication.MainViewModel
import com.example.home.baseapplication.base.factory.ViewModelKey
import com.example.home.baseapplication.repository.Repository
import com.example.home.baseapplication.repository.RepositoryImpl
import com.example.home.baseapplication.usecase.UseCase
import com.example.home.baseapplication.usecase.UseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
interface DiModule {

    @Binds
    fun bindRepository(repository: RepositoryImpl): Repository

    @Binds
    fun bindUseCase(repository: UseCaseImpl): UseCase

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(viewModel: MainViewModel): ViewModel

    @ContributesAndroidInjector
    fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    fun bindFragmentOne(): FragmentOne

    @ContributesAndroidInjector
    fun bindFragmentTwo(): FragmentTwo

    @ContributesAndroidInjector
    fun bindFragmentThree(): FragmentThree
}