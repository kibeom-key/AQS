package kr.kb.quickstarter.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.kb.data.repository.remote.api.service.ExampleUserApi
import kr.kb.data.repository.remote.datasource.ExampleDataSource
import kr.kb.data.repository.remote.datasource.ExampleDataSourceImpl

@Module
@InstallIn(SingletonComponent::class)
class DataSourceModule {
    /**
     * This is example code.
     */
    @Provides
    fun provideExampleDataSource(
        exampleUserApi: ExampleUserApi
    ): ExampleDataSource{
        return ExampleDataSourceImpl(exampleUserApi)
    }
}