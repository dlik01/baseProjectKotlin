package com.example.home.baseapplication.repository

import android.util.Log
import javax.inject.Inject

class RepositoryImpl @Inject constructor(): Repository {
    override fun repository() {
        Log.e("TAG", "repository " )
    }
}