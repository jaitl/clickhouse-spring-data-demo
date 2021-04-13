package com.github.jaitl.clickhouse.demo

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.transaction.PlatformTransactionManager
import org.springframework.transaction.TransactionDefinition
import org.springframework.transaction.TransactionStatus
import org.springframework.transaction.support.SimpleTransactionStatus
import org.springframework.transaction.support.TransactionOperations

@Configuration
class ApplicationConfiguration {
    @Bean
    fun springSessionTransactionOperations(): TransactionOperations {
        return TransactionOperations.withoutTransaction()
    }

    @Bean
    fun transactionManager(): PlatformTransactionManager {
        return object : PlatformTransactionManager {
            override fun getTransaction(definition: TransactionDefinition?): TransactionStatus =
                SimpleTransactionStatus()

            override fun commit(status: TransactionStatus) {
            }

            override fun rollback(status: TransactionStatus) {
            }
        }
    }
}
