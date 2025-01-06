package com.example.b01.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
public class SampleJsonController {
    @GetMapping("/helloArr")
    public String[] helloArr() {
        log.info("hello arr...");
        return new String[]{"AAA","BBB","CCC"};
    }
}
