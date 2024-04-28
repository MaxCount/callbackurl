package org.by.khomichenko;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UpworkController {
    @GetMapping("https://maxcount.github.io/callbackurl/")
    String hello() {
        return "Hello, World!";
    }
}
