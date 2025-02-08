package com.example.b01.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@Tag(name="normal", description="mvc")
public class SampleController {

    @GetMapping("/hello")
    public String hello(Model m){
        log.info("hello......");
        return "normal controller";
    }
}
