package com.github.jaitl.clickhouse.demo.repository

import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Table
import java.sql.Timestamp

@Table("items")
data class DataItem(val itemId: String, val timestamp: Timestamp, val data: String) :
    Persistable<String> {
    override fun getId(): String = itemId
    override fun isNew(): Boolean = true
}
