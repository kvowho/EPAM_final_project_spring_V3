package net.voznjuk.FinalProjectV3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hello")
    public String SayHello() {
        return "Hello World";
    }
}
