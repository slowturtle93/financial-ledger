package com.haksong.financial

import jakarta.annotation.PostConstruct
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*


@SpringBootApplication
class FinancialApplication {
    @PostConstruct
    fun defaultTimeZoneSetting() {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"))
    }
}


fun main(args: Array<String>) {
    runApplication<FinancialApplication>(*args)
}