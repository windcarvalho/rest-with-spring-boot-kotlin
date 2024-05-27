package br.great.rest_with_spring_boot_kotlin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {
    val counter:AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value ="name", defaultValue="Anônimo") name: String?) : Greeting{
        return Greeting(counter.incrementAndGet(), "Saudações "+name)
        //"Saudações cliente de número : &counter"
    }

}