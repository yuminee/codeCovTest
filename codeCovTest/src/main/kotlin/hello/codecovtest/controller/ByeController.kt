package hello.codecovtest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ByeController {
    @GetMapping("/message")
    fun get(): String = "Bye"

    @PostMapping("/message")
    fun post(): String = "Bye"

}