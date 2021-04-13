package com.github.jaitl.clickhouse.demo.controller

import com.github.jaitl.clickhouse.demo.repository.DataItem
import com.github.jaitl.clickhouse.demo.repository.DataItemRepository
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("v1/demo/item")
class ItemController(val dataItemRepository: DataItemRepository) {
    private val logger = LoggerFactory.getLogger(javaClass)

    @PostMapping
    fun create(@RequestBody item: DataItem): String {
        logger.info("Write the item to DB: $item")
        dataItemRepository.save(item)
        return "OK"
    }

    @GetMapping
    fun get(): List<DataItem> {
        logger.info("Get all items from DB")
        return dataItemRepository.findAll().toList()
    }
}
