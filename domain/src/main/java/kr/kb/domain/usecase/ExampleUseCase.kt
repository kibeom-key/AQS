package kr.kb.domain.usecase

import kr.kb.domain.repository.ExampleRepository
import kr.kb.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

/**
 * This is example code.
 */
class ExampleUseCase @Inject constructor(
    private val repository: ExampleRepository
) {
    suspend fun execute(
        remoteErrorEmitter: RemoteErrorEmitter,
        id: String
    ) = repository.getUser(remoteErrorEmitter, id)
}