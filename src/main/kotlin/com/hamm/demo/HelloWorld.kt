package com.hamm.demo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam

import org.springframework.web.bind.annotation.GetMapping




@RestController
class HelloWorld {
	@GetMapping("/hello")
	fun sayHello(@RequestParam(value = "myName", defaultValue = "World") name: String?): String? {
		return String.format("Hello %s!", "hamm")
	}

	fun getStuff() = "Jason"
}