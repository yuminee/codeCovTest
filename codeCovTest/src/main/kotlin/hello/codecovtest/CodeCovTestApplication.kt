package hello.codecovtest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CodeCovTestApplication

fun main(args: Array<String>) {
    runApplication<CodeCovTestApplication>(*args)
}
