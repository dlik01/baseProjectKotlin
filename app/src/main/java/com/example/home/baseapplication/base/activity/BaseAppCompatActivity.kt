package com.example.home.baseapplication.base.activity

import com.example.home.baseapplication.base.factory.ViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

/**
 * Taxcom dagger app compat activity - рутовая активити для всех экранов приложений
 *
 */

abstract class BaseAppCompatActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

}