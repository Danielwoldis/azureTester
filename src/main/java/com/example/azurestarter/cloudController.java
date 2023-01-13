package com.example.azurestarter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cloudController {


    @GetMapping("/")
    public String helloWorld(@RequestParam(defaultValue = "Cloud") String name) {
        return "Hello " + name;
    }
}
