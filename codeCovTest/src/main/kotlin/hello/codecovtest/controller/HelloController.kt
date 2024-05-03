package hello.codecovtest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {
    @GetMapping("/message")
    fun get(): String = "Hello"

    @PostMapping("/message")
    fun post(): String = "Hello"

}