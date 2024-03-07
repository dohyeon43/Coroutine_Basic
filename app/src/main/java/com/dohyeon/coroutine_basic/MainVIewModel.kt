package com.dohyeon.coroutine_basic

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainViewModel : ViewModel() {
    fun main() = runBlocking {
        //코루틴 작업 단위
        launch {
            wait1000ms()
            println("world!")
        }
        println("Hello, ")
    }

    private suspend fun wait1000ms(){
        delay(1000L)
    }
}