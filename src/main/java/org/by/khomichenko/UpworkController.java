package org.by.khomichenko;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpworkController {
    @GetMapping("/")
    String hello() {
        return "Hello, World!";
    }
}
