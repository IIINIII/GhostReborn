package com.ibrokhim.ghostreborn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicController {

    @GetMapping("")
    public String index() {
        return "Hello World!";
    }

}
