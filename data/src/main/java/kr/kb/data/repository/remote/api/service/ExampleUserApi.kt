package kr.kb.data.repository.remote.api.service

import kr.kb.data.repository.remote.api.model.ExampleUserResponse
import retrofit2.Response
import retrofit2.http.GET

/**
 * This is example code.
 */
interface ExampleUserApi {
    @GET("/user")
    suspend fun getUser(
        id: String
    ): Response<ExampleUserResponse>
}