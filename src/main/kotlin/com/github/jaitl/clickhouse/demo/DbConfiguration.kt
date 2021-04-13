package com.github.jaitl.clickhouse.demo

import com.github.jaitl.clickhouse.demo.converter.StringListReadingConverter
import com.github.jaitl.clickhouse.demo.converter.StringListWritingConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration
import org.springframework.data.relational.core.dialect.Dialect
import org.springframework.data.relational.core.dialect.MySqlDialect
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcOperations

@Configuration
class DbConfiguration : AbstractJdbcConfiguration() {
    @Bean
    override fun jdbcCustomConversions(): JdbcCustomConversions {
        return JdbcCustomConversions(
            mutableListOf(
                StringListWritingConverter(),
                StringListReadingConverter()
            )
        )
    }
}
