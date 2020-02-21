package com.example.springkt

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class Echo {

    @GetMapping("/")
    @ResponseBody
    fun hey(@RequestParam message: String): String {
        return "echo: $message"
    }
}