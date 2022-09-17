package kr.kb.data.mapper

import kr.kb.data.repository.remote.api.model.ExampleUserResponse
import kr.kb.domain.model.ExampleUserData

/**
 * This is example code.
 */
object ExampleMapper {
    fun userMapper(source: ExampleUserResponse?): ExampleUserData? {
        return if(source != null){
            ExampleUserData(
                name = source.name,
                age = source.age,
                gender = source.gender,
                residence = source.residence
            )
        }else{
            null
        }
    }
}