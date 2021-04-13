package com.github.jaitl.clickhouse.demo.repository

import com.github.jaitl.clickhouse.demo.model.StringList
import org.springframework.data.jdbc.repository.query.Modifying
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DataItemRepository : CrudRepository<DataItem, String>
