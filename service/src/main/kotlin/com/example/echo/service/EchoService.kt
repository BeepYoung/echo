package com.example.echo.service

import org.springframework.stereotype.Service

@Service
class EchoService {
    fun accept(content: String) = content
}