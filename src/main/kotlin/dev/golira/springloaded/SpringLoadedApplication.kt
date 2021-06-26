package dev.golira.springloaded

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringLoadedApplication

fun main(args: Array<String>) {
	runApplication<SpringLoadedApplication>(*args)
}
