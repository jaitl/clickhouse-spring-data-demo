package com.github.jaitl.clickhouse.demo.repository

import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import javax.xml.crypto.Data

@Repository
interface DataItemRepository : CrudRepository<DataItem, String>
