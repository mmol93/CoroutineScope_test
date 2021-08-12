# CoroutineScope_test

* 강의 보고 배운 것을 복습하기 위해 만들었음
* 참조한 부분은 https://github.com/mmol93/ViewModel_Udemy 의 CoroutineScope Branch임

* #### 기본적으로 데이터를 Coroutine으로 처리하고 해당 결과를 liveData로써 바로 반영하는 방법을 보여주는 예시다

##  CoroutineWithLiveData_test과의 차이점
- 참조: https://github.com/mmol93/CoroutineWithLiveData_test
- CoroutineWithLiveData_test: liveData로 liveData 변수를 observe 하는 동시에 코루틴으로 다른 처리를 한다
- CoroutineScope_test: 코루틴으로 데이터 처리를 하고 그 데이터 변수를 observe 하여 변화한 값이 자동으로 liveData로써 처리되게 한다

## 테크닉
- data class를 만들고
- liveData Coroutine으로 어느 함수를 처리하게 한다(물론 이 함수도 코루틴이므로 suspend fun)
- 처리한 결과는 liveData로 인해 자동으로 갱신되어 출력된다
