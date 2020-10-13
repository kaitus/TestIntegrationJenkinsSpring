package com.swat.bucaramanga.springDemoJenkins.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private static final String template = "Hello, World";

    @GetMapping(value = "/greeting", produces = MediaType.APPLICATION_JSON_VALUE)
    public String greeting() {
        return template;
    }
}
