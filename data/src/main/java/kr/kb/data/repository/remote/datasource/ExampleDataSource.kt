package kr.kb.data.repository.remote.datasource

import kr.kb.data.repository.remote.api.model.ExampleUserResponse

/**
 * This is example code.
 */
interface ExampleDataSource {
    suspend fun getUser(id: String): ExampleUserResponse?
}