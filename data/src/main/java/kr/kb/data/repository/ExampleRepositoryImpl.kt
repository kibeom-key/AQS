package kr.kb.data.repository

import kr.kb.data.mapper.ExampleMapper
import kr.kb.data.repository.remote.api.base.BaseRemoteRepository
import kr.kb.data.repository.remote.datasource.ExampleDataSource
import kr.kb.domain.model.ExampleUserData
import kr.kb.domain.repository.ExampleRepository
import kr.kb.domain.utils.RemoteErrorEmitter
import javax.inject.Inject

/**
 * This is example code.
 */
class ExampleRepositoryImpl @Inject constructor(
    private val exampleDataSource: ExampleDataSource
) : ExampleRepository, BaseRemoteRepository() {

    override suspend fun getUser(
        remoteErrorEmitter: RemoteErrorEmitter,
        id: String
    ): ExampleUserData? {
        return ExampleMapper.userMapper(
            safeApiCall(remoteErrorEmitter) {
                exampleDataSource.getUser(id)
            })
    }
}