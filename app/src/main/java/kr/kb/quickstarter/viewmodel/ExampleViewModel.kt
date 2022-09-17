package kr.kb.quickstarter.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import kr.kb.domain.usecase.ExampleUseCase
import kr.kb.domain.utils.ErrorType
import kr.kb.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

/**
 * This is example code.
 */

@HiltViewModel
class ExampleViewModel @Inject constructor(
    private val exampleUseCase: ExampleUseCase
): ViewModel(), RemoteErrorEmitter {
    fun getUserById(id: String){
        viewModelScope.launch {
            exampleUseCase.execute(this@ExampleViewModel, id)
        }
    }

    override fun onError(msg: String) {
        TODO("Not yet implemented")
    }

    override fun onError(errorType: ErrorType) {
        TODO("Not yet implemented")
    }
}