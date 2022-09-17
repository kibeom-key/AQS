package kr.kb.data.repository.remote.datasource

import kr.kb.data.repository.remote.api.model.ExampleUserResponse
import kr.kb.data.repository.remote.api.service.ExampleUserApi
import javax.inject.Inject

/**
 * This is example code.
 */
class ExampleDataSourceImpl @Inject constructor(
    private val api: ExampleUserApi
): ExampleDataSource {
    override suspend fun getUser(id: String): ExampleUserResponse? {
        return api.getUser(id).body()
    }
}