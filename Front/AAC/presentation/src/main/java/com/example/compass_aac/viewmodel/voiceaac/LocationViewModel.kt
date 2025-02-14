/** Project : 2023 AAC Compass
 * Program Purpose and Features :
 * - SearchLocation.kt에서 위치 권한 허용을 받아와 viewmodel에서 위치 정보 찾기
 * Author : ES.KEE
 * First Write Date : 2023.07.14
 * ==========================================================================
 * Program history
 * ==========================================================================
 * Author            Date            Version        History        code to fix
 **/

package com.example.compass_aac.viewmodel.voiceaac

import android.app.Application
import android.location.Location
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.compass_aac.view.ConvertGPS
import com.example.domain.model.Categories
import com.example.domain.model.LocationParam
import com.example.domain.usecase.LocationUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject


@HiltViewModel
class LocationViewModel @Inject constructor(private val usecase : LocationUseCase, application: Application)  : AndroidViewModel(application) {

    //프로그래스바 제어
    val _isLoading = MutableLiveData<Boolean>()
    val isLoading : LiveData<Boolean> get() = _isLoading
    //카테고리 값
    val _categoryResult = MutableLiveData<Result<Categories>>()
    val categoryResult : LiveData<Result<Categories>> get() = _categoryResult

    val _reseachBtn = MutableLiveData<String>()
    val researchBtn : LiveData<String> get() = _reseachBtn
    fun fetchLocationAsync() = viewModelScope.launch {
        _isLoading.value = true
        val maxRetryCount = 2 // 최대 재시도 횟수 설정
        var retryCount = 0

        while (retryCount < maxRetryCount) {
            try {
                val result = withContext(Dispatchers.IO) {
                    usecase.execute()
                }
                Log.d("location", result.toString())
                val location: Location? = result.getOrNull()

                Log.d("location", location.toString())

                location?.let {
                    val latitude = it.latitude
                    val longitude = it.longitude
                    Log.d("Location", "Latitude: ${latitude}, Longitude: ${longitude}")
                    val XY = ConvertGPS(0, location.latitude, location.longitude)
                    Log.d("좌표 값", "${XY.x}, ${XY.y}")

                    //x,y좌표값 서버에 전송 후 카테고리 응답값 받기
                    //받아온 카테고리 값 livedata에 저장
                    val locationRequest = LocationParam(latitude, longitude)
                    Log.d("locationrequest", "${locationRequest.x}, ${locationRequest.y}")
                    val categoryresult = usecase.getCategories(locationRequest)
                    Log.d("categoryresult", "$categoryresult")

                    _categoryResult.postValue(Result.success(categoryresult))
                    Log.d("categoryresult", categoryresult.toString())
                } ?: run {
                    // location이 null인 경우 실행될 코드를 여기에 작성
                }

                // 성공한 경우 반복문을 빠져나옴
                break
            } catch (e: Exception) {
                // 네트워크 오류 처리
                retryCount++
                if (retryCount < maxRetryCount) {
                    val delayMillis = 3000L // 재시도 간격 설정 (3초)
                    delay(delayMillis)
                    Log.d("재시도", "재시도")
                } else {
                    Toast.makeText(getApplication(), "현 위치 탐색에 실패하였습니다.\n네트워크 연결을 확인해주세요.", Toast.LENGTH_SHORT).show()
                    _reseachBtn.value = "visible"
                    Log.e("위치 탐색 실패", "Error fetching location", e)
                    _isLoading.postValue(false)

                }
            } finally {
//                _isLoading.postValue(false)
            }
        }
    }
}