package com.somesh.restcontroller.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestCtroller {

    private static final Logger log = LoggerFactory.getLogger(SimpleRestCtroller.class);

    @GetMapping("/getControllerResponse")
    public String getControllerDetails(){
        log.info("Returning Response");
        return "Welcome to Simple Rest Controller";
    }
}
