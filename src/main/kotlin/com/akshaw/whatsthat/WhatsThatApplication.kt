package com.akshaw.whatsthat

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WhatsThatApplication

fun main(args: Array<String>) {
	runApplication<WhatsThatApplication>(*args)
}
