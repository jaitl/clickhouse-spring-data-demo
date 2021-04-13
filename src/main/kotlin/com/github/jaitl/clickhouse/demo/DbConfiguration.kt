package com.github.jaitl.clickhouse.demo

import com.github.jaitl.clickhouse.demo.converter.StringListReadingConverter
import com.github.jaitl.clickhouse.demo.converter.StringListWritingConverter
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jdbc.core.convert.JdbcCustomConversions
import org.springframework.data.jdbc.repository.config.AbstractJdbcConfiguration

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
