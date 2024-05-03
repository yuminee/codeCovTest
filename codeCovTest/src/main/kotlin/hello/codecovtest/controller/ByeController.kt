package hello.codecovtest.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ByeController {
    @GetMapping("/bye")
    fun get(): String = "Bye"

    @PostMapping("/bye")
    fun post(): String = "Bye"

}