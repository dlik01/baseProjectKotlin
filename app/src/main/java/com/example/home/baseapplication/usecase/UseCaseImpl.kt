package com.example.home.baseapplication.usecase

import com.example.home.baseapplication.repository.Repository
import javax.inject.Inject

class UseCaseImpl @Inject constructor(
    private val repository: Repository
): UseCase {
    override fun testFun() {
        repository.repository()
    }
}