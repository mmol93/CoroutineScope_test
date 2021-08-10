package com.example.corotuienscope_test

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers

class MainViewModel : ViewModel() {
    private val userRepository = UserRepository()

    // getUser 에서 반환받은 값을 liveData로 설정
    var users = liveData(Dispatchers.IO) {
        val result = userRepository.getUsers()
        emit(result)
    }
}