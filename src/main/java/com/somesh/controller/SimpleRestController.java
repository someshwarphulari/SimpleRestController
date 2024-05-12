package com.somesh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    private static final Logger log = LoggerFactory.getLogger(SimpleRestController.class);

    @GetMapping("/")
    public String letsStrt(){
        log.info("Welcome to SimpleRestControllerApplication");
        return "Welcome to SimpleRestControllerApplication";
    }
}
