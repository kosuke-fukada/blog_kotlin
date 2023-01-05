package com.example.demo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping

data class Message(val message: String)

@RestController
class SampleController {
  @GetMapping("/")
  fun index(): Message {
    return Message("hogehoge")
  }
}