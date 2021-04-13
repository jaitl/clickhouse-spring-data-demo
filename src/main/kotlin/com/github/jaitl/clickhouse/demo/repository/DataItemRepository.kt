package com.github.jaitl.clickhouse.demo.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface DataItemRepository : CrudRepository<DataItem, String>
