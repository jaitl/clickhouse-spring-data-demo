package com.github.jaitl.clickhouse.demo.repository

import com.fasterxml.jackson.annotation.JsonIgnore
import com.github.jaitl.clickhouse.demo.model.StringList
import org.springframework.data.domain.Persistable
import org.springframework.data.relational.core.mapping.Table
import java.sql.Timestamp

@Table("items")
data class DataItem(
    val itemId: String,
    val timestamp: Timestamp,
    val data: String,
    val list: StringList
) :
    Persistable<String> {
    @JsonIgnore
    override fun getId(): String = itemId
    @JsonIgnore
    override fun isNew(): Boolean = true
}
