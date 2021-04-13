package com.github.jaitl.clickhouse.demo.controller

import com.github.jaitl.clickhouse.demo.repository.DataItem
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("v1/demo/item")
class ItemController {
    @PostMapping
    fun create(@RequestBody item: DataItem): String {
        return "OK"
    }
}
