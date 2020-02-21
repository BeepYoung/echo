package com.example.echo.controller

import com.example.echo.service.EchoService
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class EchoController(
    private val echoService: EchoService
) {
    @GetMapping("/echo")
    @ResponseBody
    fun hey(@RequestBody body: String) = "message: ${echoService.accept(body)}"
}