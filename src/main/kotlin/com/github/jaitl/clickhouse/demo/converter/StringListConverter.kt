package com.github.jaitl.clickhouse.demo.converter

import org.springframework.core.convert.converter.Converter
import org.springframework.data.convert.ReadingConverter
import org.springframework.data.convert.WritingConverter

@WritingConverter
class StringListWritingConverter : Converter<StringList, String> {
    override fun convert(source: StringList): String {
        return source.list.joinToString(",", "[", "]") { "'$it'" }
    }
}

@ReadingConverter
class StringListReadingConverter : Converter<String, StringList> {
    override fun convert(source: String): StringList {
        val list = source.removePrefix("[").removeSuffix("]").replace("'", "").split(",")
        return StringList(list)
    }
}
