package kr.kb.quickstarter.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kr.kb.data.repository.ExampleRepositoryImpl
import kr.kb.data.repository.remote.datasource.ExampleDataSource
import kr.kb.domain.repository.ExampleRepository

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    /**
     * This is example code.
     */
    @Provides
    fun provideExampleRepository(
        dataSource: ExampleDataSource
    ): ExampleRepository {
        return ExampleRepositoryImpl(dataSource)
    }
}