package com.akshaw.whatsthat.controllers

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WhatsThatController {

    @GetMapping("/")
    fun greet(): ResponseEntity<String> {
        val randomNumber = (9999..20000).random()
        return ResponseEntity("Hello Ak: $randomNumber", HttpStatus.OK)
    }

}