package com.example.corotuienscope_test

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUsers() : List<User>{
        // observe로 데이터 변화에 따른 결과를 보여주고 싶기 때문에 delay를 넣는다
        delay(3000)
        // 집단의 집단 변수 생성
        val users : List<User> = listOf(
            User(1, "a"),
            User(2, "b"),
            User(3, "c"),
            User(4, "d")
        )
        return users
    }
}