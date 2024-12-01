package com.example.home.baseapplication

import androidx.lifecycle.ViewModel
import com.example.home.baseapplication.usecase.UseCase
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val useCase: UseCase
) : ViewModel(){

    fun testUseCase(){
        useCase.testFun()
    }
}