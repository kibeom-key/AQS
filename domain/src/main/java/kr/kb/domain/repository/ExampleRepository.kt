package kr.kb.domain.repository

import kr.kb.domain.model.ExampleUserData
import kr.kb.domain.utils.RemoteErrorEmitter

/**
 * This is example code.
 */
interface ExampleRepository {
    suspend fun getUser(
        remoteErrorEmitter: RemoteErrorEmitter,
        id: String): ExampleUserData?
}