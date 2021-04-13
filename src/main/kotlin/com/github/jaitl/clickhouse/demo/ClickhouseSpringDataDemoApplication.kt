package com.github.jaitl.clickhouse.demo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ClickhouseSpringDataDemoApplication

fun main(args: Array<String>) {
	runApplication<ClickhouseSpringDataDemoApplication>(*args)
}
